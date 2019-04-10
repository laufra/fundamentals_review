/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hockeyregistrar;

/**
 * A utility class to verify that players on 
 * a hockey team meet certain criteria with respect
 * to their age for an 'under 10' team. Used for final
 * exam review.
 * @author dancye, 2019
 */
public class HockeyRegistrarValidator 
{

    /**
     * A method that validates that players are eligible for '10 and under' meaning they must be born in 2009 or later .
     * @param playerBirthYear, the player's year of birth
     * @return true if the player was born in 2009 or later, false otherwise. 
     */
    public boolean validateBirthYear(int playerBirthYear)
    {
        if(playerBirthYear>=2009)
        {
            return true;
        }
        return false;
    }
    
}
