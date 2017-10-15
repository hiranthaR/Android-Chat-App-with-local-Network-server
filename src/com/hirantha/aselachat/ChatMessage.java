/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hirantha.aselachat;

import java.io.Serializable;

/**
 *
 * @author Hirantha
 */
public class ChatMessage implements Serializable {

    protected static final long serialVersionUID = 1112122200L;
    
    // The different types of message sent by the Client
    // WHOISIN to receive the list of the users connected
    // MESSAGE an ordinary message
    // LOGOUT to disconnect from the Server
    static final public int WHOISIN = 0, MESSAGE = 1, LOGOUT = 2;
    public int type;
    public String message;
    public String time;
    public String userName;

    // constructor

    public ChatMessage(int type,String userName, String message,String time) {
        this.type = type;
        this.message = message;
        this.time = time;
        this.userName=userName;
    }



    // getters
    public int getType() {
        return type;
    }
   public String getMessage() {
        return message;
    }

    public String getTime(){
        return time;
    }

   public String getUserName(){
        return userName;
    }
}