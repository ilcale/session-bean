/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packt;

import javax.ejb.Stateless;

/**
 *
 * @author IlseParra
 */
@Stateless(mappedName = "salutationBean")
public class Salutation {

    public String getFormalSalutation(String name) {
        return "Dear " + name;
    }

    public String getInformalSalutation(String name) {
        return "Hi " + name;
    }
}
