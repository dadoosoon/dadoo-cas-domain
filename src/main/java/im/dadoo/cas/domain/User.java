/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package im.dadoo.cas.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author codekitten
 */
@Data
@AllArgsConstructor
public class User {
  
  private String name;
  
  private String password;
  
}
