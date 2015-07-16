/**
 * 
 */
package com.mum.edu.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mum.edu.model.Appointment;
import com.mum.edu.model.DetailReport;
import com.mum.edu.model.Student;

/**
 * @author Prabin
 * @param <T>
 *
 */

@Repository
@Transactional(propagation = Propagation.MANDATORY)
public class AppointmentDao implements IAppointmentDao {
	@Autowired
	private SessionFactory sf;

	public Student findAppointmentByStudentID(long StudentID) {
		// TODO Auto-generated method stub
		return null;
	}

	public Student findAppointmentByTeacherID(long TeacherId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
	}

	public void addAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
	}

	public void deleteAppointment(long appointmentID) {
		// TODO Auto-generated method stub
	}

	public SessionFactory getSf() {
		return sf;
	}

	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	public List<Appointment> getAllAppointment() {
		// TODO Auto-generated method stub
		Query q = (Query) sf.getCurrentSession().createQuery("from Appointment app");
		return q.list();
	}

	public List<Appointment> getAllAppointment(long uid) {
		Query query = (Query) sf.getCurrentSession()
				.createQuery("from Appointment app where app.student.uid = :userid");
		query.setParameter("userid", uid);
		return (List<Appointment>) query.list();
	}

	public List<DetailReport> getAllAppointmentByBatch(String batch) {
		// TODO Auto-generated method stub
		System.out.println("batchasdff" + batch);
		Query query = (Query) sf.getCurrentSession().createQuery(
				"select count(*) ,app.student.studentID  , app.student.user.name from Appointment app where app.student.batchName = :batchname group by app.student.uid");
		query.setParameter("batchname", batch);
		// System.out.println(query.toString());
		List<DetailReport> detailReportList = new ArrayList<DetailReport>();
		List<Object[]> objList = (List<Object[]>) query.list();
		// List<Object> objList=(ArrayList<Object>)query.list();
		for (Object[] obj : objList) {
			DetailReport dr = new DetailReport();
			// System.out.println(obj[0].getClass());
			dr.setCnt((Long) obj[0]);
			dr.setStudentID((String) obj[1]);
			dr.setName((String) obj[2]);
			detailReportList.add(dr);
		}
		return detailReportList;
	}

	public List<Appointment> getAllIndividualAppointment(long uid) {
		Query query = (Query) sf.getCurrentSession()
				.createQuery("from Appointment app where app.student.uid = :userid and ");
		query.setParameter("userid", uid);
		return (List<Appointment>) query.list();
	}

	public List<Appointment> getAllGroupAppointment(long uid) {
		Query query = (Query) sf.getCurrentSession().createQuery("from Appointment app where app.student = :userid ");
		query.setParameter("userid", uid);
		return (List<Appointment>) query.list();
	}
}