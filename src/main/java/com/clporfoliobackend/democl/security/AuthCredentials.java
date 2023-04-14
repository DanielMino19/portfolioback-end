/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clporfoliobackend.democl.security;

import lombok.Data;

/**
 *1809 get user  credentials **/

@Data
public class AuthCredentials {
    private String email;
    private String password; 
}
