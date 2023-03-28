package com.inheritance;

public class GoogleMain {

	public static void main(String[] args) {	
          Gmail g= new Gmail();
          Youtube y=new Youtube();
          GoogleDrive h=new GoogleDrive();
          
          g.gmailAsChild();
          g.parent();
          y.youtubeAsChild();
          y.parent();
          h.driveAsChild();
          h.parent();
	}

}
