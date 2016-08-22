package start;

import javax.persistence.*;
import java.util.Date;
import java.util.List;



public class MyClass {
    private int id;
    private  String s;

    public MyClass(String myclass, int id) {
        this.myclass = myclass;
        this.id = id;
    }

    public String getMyclass() {

        return myclass;
    }

    public void setMyclass(String myclass) {
        this.myclass = myclass;
    }

    private  String myclass;

    public MyClass(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public void  f (){
        System.out.println("KUKU kukukudsfsd");
    }

    public int[] _x() {
        int mas[] = new int[100000];

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Kuziv1");
        EntityManager entityManager =entityManagerFactory.createEntityManager();
        Query query = entityManager.createQuery("select latitude  from MyDB ");
        List list =  query.setMaxResults(100000).setFirstResult(1).getResultList();
        for(int i = 0; i<list.size();i++){
           mas[i]= (Integer) list.get(i);
        }
        return mas;


    }

    public int[] _y() {
        int mas[] = new int[100000];
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Kuziv1");
        EntityManager entityManager =entityManagerFactory.createEntityManager();
        Query query = entityManager.createQuery("select longitude  from MyDB ");
        List list =  query.setMaxResults(100000).setFirstResult(1).getResultList();
        for(int i = 0; i<list.size();i++){
            mas[i]= (Integer) list.get(i);
           }
        return mas;


    }

    public String minmax() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Kuziv1");
        EntityManager entityManager =entityManagerFactory.createEntityManager();
        Query query = entityManager.createQuery("select MAX(unixTime) from MyDB");
        List list =  query.getResultList();
        Query query2 = entityManager.createQuery("select MIN(unixTime) from MyDB where unixTime>1161793573");
        List list2 =  query2.getResultList();
        Date  date1 = new Date((Integer) list.get(0)*1000L);
        Date  date2=  new Date((Integer) list2.get(0)*1000L);
         return date2+" по "+date1;


    }


    public int id_gps() {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Kuziv1");
        EntityManager entityManager =entityManagerFactory.createEntityManager();
        Query query = entityManager.createQuery("select mobitel_ID from MyDB");
        List list =  query.getResultList();
        int  id_g = (Integer) list.get(0);
        return id_g;


    }

}

