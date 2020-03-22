package com.capgemini.healthcaresystem.util;


import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import com.capgemini.healthcaresystem.dto.DiagnosticCenterDto;

public class DiagnosticCenterRepository
{
   private static List<DiagnosticCenterDto> DiagnosticCenterCollectionObject=new  CopyOnWriteArrayList<DiagnosticCenterDto>();
   
   static
   {
	DiagnosticCenterCollectionObject.add(new DiagnosticCenterDto("1111","Jalandhar"));
	
	DiagnosticCenterCollectionObject.add(new DiagnosticCenterDto("2222","Phagwara"));

	DiagnosticCenterCollectionObject.add(new DiagnosticCenterDto("3333","Amritsar"));

	DiagnosticCenterCollectionObject.add(new DiagnosticCenterDto("4444","Chandigarh"));
	
	DiagnosticCenterCollectionObject.add(new DiagnosticCenterDto("5555","GoaInd"));
	
	DiagnosticCenterCollectionObject.add(new DiagnosticCenterDto("6666","Delhi"));
	
	DiagnosticCenterCollectionObject.add(new DiagnosticCenterDto("7777","Prayagraj"));
	
	DiagnosticCenterCollectionObject.add(new DiagnosticCenterDto("8888","Hyderabad"));
	
	DiagnosticCenterCollectionObject.add(new DiagnosticCenterDto("9999","Kolkata"));
	
	DiagnosticCenterCollectionObject.add(new DiagnosticCenterDto("1010","Banaras"));
	
	DiagnosticCenterCollectionObject.add(new DiagnosticCenterDto("1100","Hosiyarpur"));
	
	DiagnosticCenterCollectionObject.add(new DiagnosticCenterDto("1200","Mumbai"));
	
   }

   public static List<DiagnosticCenterDto> getDiagnosticCenterCollectionObject()
   {
	    return DiagnosticCenterCollectionObject;
   }

    public static void setDiagnosticCenterCollectionObject(List<DiagnosticCenterDto> diagnosticCenterCollectionObject) 
    {
	     DiagnosticCenterRepository.DiagnosticCenterCollectionObject = diagnosticCenterCollectionObject;
    }
 
}
