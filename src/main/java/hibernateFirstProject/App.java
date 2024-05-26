package hibernateFirstProject;

import org.hibernate.HibernateException;

import org.hibernate.SessionFactory;
//yhn maine org.hibernate import kiya kyuki mera session factory interface isi class m rkha hua h 

import org.hibernate.cfg.Configuration;
//yhn maine org.hibernate.cfg.configuration isliye import kiya kyuki meri configuration yhn rkhi hui h


/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Project started");

		// session-factory ek interface hai jo ki org.hibernate m rkha hua h,it's a type
		// of connection but more a Threat safe object, for one
		// project there is only a sessin-factory, used to make sessions and sessions
		// will help us to save data

		try {
			SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			System.out.println(factory);
		} catch (HibernateException e) {
			System.out.println("HibernateException : " + e.getMessage());
			System.out.println(e.getCause());
		}

		catch (Exception e) {
			System.out.println("Exception : " + e.getMessage());
			System.out.println(e.getCause());
		}

		// yhn maine (SessionFactory factory = new SessionFactory krke iska object kyu
		// nhi bnaya ?
		// becoz session factory ek interface hai or mujhe kisi interface ka object
		// bnane k liye kisi class ki help leni hogi

		// SessionFactory factory = new
		// Configuration().configure().buildSessionFactory();
		// yhi kaam m alg alg steps m bhi kr skta hu
		// Kaise ?
		// Configuration cfg = new Configuration();
		// cfg.configure("hibernate.cfg.xml"); --> agar file ka naam kuch different h
		// isse ya location shi nhi h to aapko uska path or naam dena
		// pad skta h
		// SessionFactory factory = cfg.buildSessionFactory();

	}
}
