
package com.leuville.fournisseurservice;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.2
 * 2016-06-01T11:12:30.813+01:00
 * Generated source version: 3.0.2
 * 
 */
public final class FournisseurService_FournisseurServiceSOAP_Client {

    private static final QName SERVICE_NAME = new QName("http://www.leuville.com/fournisseurService/", "fournisseurService");

    private FournisseurService_FournisseurServiceSOAP_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = FournisseurService_Service.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        FournisseurService_Service ss = new FournisseurService_Service(wsdlURL, SERVICE_NAME);
        FournisseurService port = ss.getFournisseurServiceSOAP();  
        
        {
        System.out.println("Invoking getPrix...");
        java.lang.String _getPrix_codeProduit = "";
        float _getPrix__return = port.getPrix(_getPrix_codeProduit);
        System.out.println("getPrix.result=" + _getPrix__return);


        }
        {
        System.out.println("Invoking commander...");
        com.leuville.fournisseurservice.Commander.Commande _commander_commande = null;
        boolean _commander__return = port.commander(_commander_commande);
        System.out.println("commander.result=" + _commander__return);


        }

        System.exit(0);
    }

}
