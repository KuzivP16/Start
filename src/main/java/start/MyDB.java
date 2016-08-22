package start;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//(name = "MydDB")
@Table
public class MyDB {
    private int DataGps_ID,Mobitel_ID,Message_ID,Latitude,Longitude,Altitude,UnixTime,Speed,Direction,Valid,InMobitelID,Events,Sensor1,Sensor2,Sensor3,Sensor4,Sensor5,Sensor6,Sensor7,Sensor8,LogID,isShow,whatIs,Counter1,Counter2,Counter3,Counter4,SrvPacketID;

    public MyDB() {
    }

    @Override
    public String toString() {
        return "MyDB{" +
                "DataGps_ID=" + DataGps_ID +
                ", Mobitel_ID=" + Mobitel_ID +
                ", Message_ID=" + Message_ID +
                ", Latitude=" + Latitude +
                ", Longitude=" + Longitude +
                ", Altitude=" + Altitude +
                ", UnixTime=" + UnixTime +
                ", Speed=" + Speed +
                ", Direction=" + Direction +
                ", Valid=" + Valid +
                ", InMobitelID=" + InMobitelID +
                ", Events=" + Events +
                ", Sensor1=" + Sensor1 +
                ", Sensor2=" + Sensor2 +
                ", Sensor3=" + Sensor3 +
                ", Sensor4=" + Sensor4 +
                ", Sensor5=" + Sensor5 +
                ", Sensor6=" + Sensor6 +
                ", Sensor7=" + Sensor7 +
                ", Sensor8=" + Sensor8 +
                ", LogID=" + LogID +
                ", isShow=" + isShow +
                ", whatIs=" + whatIs +
                ", Counter1=" + Counter1 +
                ", Counter2=" + Counter2 +
                ", Counter3=" + Counter3 +
                ", Counter4=" + Counter4 +
                ", SrvPacketID=" + SrvPacketID +
                '}';
    }

    public MyDB(int dataGps_ID, int mobitel_ID, int message_ID, int latitude, int longitude, int altitude, int unixTime, int speed, int direction, int valid, int inMobitelID, int events, int sensor1, int sensor2, int sensor3, int sensor4, int sensor5, int sensor6, int sensor7, int sensor8, int logID, int isShow, int whatIs, int counter1, int counter2, int counter3, int counter4, int srvPacketID) {
        DataGps_ID = dataGps_ID;
        Mobitel_ID = mobitel_ID;
        Message_ID = message_ID;
        Latitude = latitude;
        Longitude = longitude;
        Altitude = altitude;
        UnixTime = unixTime;
        Speed = speed;
        Direction = direction;
        Valid = valid;
        InMobitelID = inMobitelID;
        Events = events;
        Sensor1 = sensor1;
        Sensor2 = sensor2;
        Sensor3 = sensor3;
        Sensor4 = sensor4;
        Sensor5 = sensor5;
        Sensor6 = sensor6;
        Sensor7 = sensor7;
        Sensor8 = sensor8;
        LogID = logID;
        this.isShow = isShow;
        this.whatIs = whatIs;
        Counter1 = counter1;
        Counter2 = counter2;
        Counter3 = counter3;
        Counter4 = counter4;
        SrvPacketID = srvPacketID;
    }

    @Id
    public int getDataGps_ID() {


        return DataGps_ID;
    }

    public void setDataGps_ID(int dataGps_ID) {
        DataGps_ID = dataGps_ID;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int getMobitel_ID() {
        return Mobitel_ID;
    }

    public void setMobitel_ID(int mobitel_ID) {
        Mobitel_ID = mobitel_ID;
    }

    public int getMessage_ID() {
        return Message_ID;
    }

    public void setMessage_ID(int message_ID) {
        Message_ID = message_ID;
    }

    public int getLatitude() {
        return Latitude;
    }

    public void setLatitude(int latitude) {
        Latitude = latitude;
    }

    public int getLongitude() {
        return Longitude;
    }

    public void setLongitude(int longitude) {
        Longitude = longitude;
    }

    public int getAltitude() {
        return Altitude;
    }

    public void setAltitude(int altitude) {
        Altitude = altitude;
    }

    public int getUnixTime() {
        return UnixTime;
    }

    public void setUnixTime(int unixTime) {
        UnixTime = unixTime;
    }

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }

    public int getDirection() {
        return Direction;
    }

    public void setDirection(int direction) {
        Direction = direction;
    }

    public int getValid() {
        return Valid;
    }

    public void setValid(int valid) {
        Valid = valid;
    }

    public int getInMobitelID() {
        return InMobitelID;
    }

    public void setInMobitelID(int inMobitelID) {
        InMobitelID = inMobitelID;
    }

    public int getSensor1() {
        return Sensor1;
    }

    public void setSensor1(int sensor1) {
        Sensor1 = sensor1;
    }

    public int getEvents() {
        return Events;
    }

    public void setEvents(int events) {
        Events = events;
    }

    public int getSensor2() {
        return Sensor2;
    }

    public void setSensor2(int sensor2) {
        Sensor2 = sensor2;
    }

    public int getSensor3() {
        return Sensor3;
    }

    public void setSensor3(int sensor3) {
        Sensor3 = sensor3;
    }

    public int getSensor4() {
        return Sensor4;
    }

    public void setSensor4(int sensor4) {
        Sensor4 = sensor4;
    }

    public int getSensor5() {
        return Sensor5;
    }

    public void setSensor5(int sensor5) {
        Sensor5 = sensor5;
    }

    public int getSensor6() {
        return Sensor6;
    }

    public void setSensor6(int sensor6) {
        Sensor6 = sensor6;
    }

    public int getSensor7() {
        return Sensor7;
    }

    public void setSensor7(int sensor7) {
        Sensor7 = sensor7;
    }

    public int getSensor8() {
        return Sensor8;
    }

    public void setSensor8(int sensor8) {
        Sensor8 = sensor8;
    }

    public int getLogID() {
        return LogID;
    }

    public void setLogID(int logID) {
        LogID = logID;
    }

    public int getIsShow() {
        return isShow;
    }

    public void setIsShow(int isShow) {
        this.isShow = isShow;
    }

    public int getWhatIs() {
        return whatIs;
    }

    public void setWhatIs(int whatIs) {
        this.whatIs = whatIs;
    }

    public int getCounter1() {
        return Counter1;
    }

    public void setCounter1(int counter1) {
        Counter1 = counter1;
    }

    public int getCounter2() {
        return Counter2;
    }

    public void setCounter2(int counter2) {
        Counter2 = counter2;
    }

    public int getCounter3() {
        return Counter3;
    }

    public void setCounter3(int counter3) {
        Counter3 = counter3;
    }

    public int getCounter4() {
        return Counter4;
    }

    public void setCounter4(int counter4) {
        Counter4 = counter4;
    }

    public int getSrvPacketID() {
        return SrvPacketID;
    }

    public void setSrvPacketID(int srvPacketID) {
        SrvPacketID = srvPacketID;
    }
}
