package day13_String;

public class GetDomainName {

	public static void main(String[] args) {
		
		
		String wal = "help@walmart.com";
		String amazon = "help@aws.com";
		String usc = "help@uscis.gov";
		String git = "help@github.com";
		
		System.out.println(wal.indexOf('@'));
		
		System.out.println(wal.substring(4));
		System.out.println(wal.substring(4 + 1));
		System.out.println(wal.lastIndexOf('.'));
		
		System.out.println(wal.substring(4+1, 12));
		
		int startingIndex = wal.indexOf('@')+1;
		
		int endingIndex = wal.lastIndexOf('.');
		
		String domainName = wal.substring(startingIndex, endingIndex);
		
		System.out.println(domainName);
	
		
		
		

	}

}
