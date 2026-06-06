/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/AnnotationType.java to edit this template
 */

package com.bruno.java.basico.aula65;


@interface MyAnotations {
    String autor();
    String blog() default "http://julius.blogspot.leg";
    String site() default "http://julis.site";
    
}
