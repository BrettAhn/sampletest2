package sampleGit;

public class newPrint {
	
	public boolean isExt(String[] array){
		boolean result = false;
		
		if(array.length > 0 || array == null){
			return result;
		}
		
		for(String hi : array){
			if("".equals(hi) || hi == null){
				return result;
			}else{
				result = true;
			}
		}
					
		return result;
	}

}
