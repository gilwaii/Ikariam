/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author maidoanh
 */
public class SentArmy {
    RealArmy realArmy;
    long arrivalTime;
    long attackTime = 0;

    public RealArmy getRealArmy() {
        return realArmy;
    }

    public void setRealArmy(RealArmy realArmy) {
        this.realArmy = realArmy;
    }

    public long getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(long arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
    
    public long getAttackTime() {
        return attackTime;
    }

    public void setAttackTime(long attackTime) {
        this.attackTime = attackTime;
    }

    public SentArmy(RealArmy realArmy, long arrivalTime) {
        this.realArmy = realArmy;
        this.arrivalTime = arrivalTime;
    }
    
    
}
