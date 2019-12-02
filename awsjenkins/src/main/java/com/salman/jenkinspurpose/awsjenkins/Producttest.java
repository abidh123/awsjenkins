package com.salman.jenkinspurpose.awsjenkins;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.transform.Transformers;

//import com.projectname.saqwe.Product;



public class Producttest {
	
	/*public List<Product>getproductdetalis(){
		Configuration con =new Configuration().configure().addAnnotatedClass(Product.class);
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		String sql="select * from product";
		SQLQuery query=session.createSQLQuery(sql);
		query.setResultTransformer(Transformers.aliasToBean(Product.class));
	    List<Product>li=(List<Product>)query.list();
	    Iterator it=li.iterator();
	    while(it.hasNext()) {
	    	Product p=new Product();
	    	System.out.println(p.getPid());
	    	System.out.println(p.getName());
	    	System.out.println(p.getBrandname());
	    }
	
		
		return li;*/
		
	public List<Product>getproductdetalis(){
        Configuration con=new Configuration().configure().addAnnotatedClass(Product.class);
        SessionFactory sf=con.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        String sql="SELECT * FROM product";
        SQLQuery query=session.createSQLQuery(sql);
        query.setResultTransformer(Transformers.aliasToBean(Product.class));
        List<Product>list=(List<Product>) query.list();
        Iterator it=list.iterator();
        while(it.hasNext()) {
      	  Product p=new Product();
      	  p=(Product) it.next();
      	  System.out.println(p.getPid()+""+p.getName()+""+p.getBrandname());
        }
        
        
		
		return list;
	
	

}
}
