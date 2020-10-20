package objects3D;

import org.lwjgl.opengl.GL11;

import GraphicsObjects.Point4f;

public class Sphere {

	
	public Sphere() {

	}
	// Implement using notes and examine Tetrahedron to aid in the coding  look at lecture  7 , 7b and 8 
	// 7b should be your primary source, we will cover more about circles in later lectures to understand why the code works 
	public void DrawSphere(float radius,float nSlices,float nSegments) {
		//using a theta and phi to judge the location of the sphere in the surface.
		
		float inctheta = (float) ((2.0f * Math.PI) / nSlices); 
		float incphi = (float) (Math.PI / nSegments); 
		
		
		
		
		for(float theta=(float)-Math.PI;theta < (float)Math.PI;theta += inctheta){
			//calculate the point
			for(float phi=-((float)Math.PI / 2.0f);phi < ((float)Math.PI/2.0f);phi += incphi){
				//float x2 = (float) (radius * Math.cos(phi + incphi) * Math.cos(theta)),y2,z2;
				//calculate x
				float x1 =(float) ((float)radius * Math.cos(phi) * Math.cos(theta));
				//calculate y
				float y1 =(float) ((float)radius * Math.cos(phi) * Math.sin(theta));
				//calculate z
				float z1 = (float) (radius * Math.sin(phi));
				//draw the sphere
				//more nslices and nsegments,the sphere is more vivid. 
				GL11.glBegin(GL11.GL_POINTS);
				GL11.glNormal3f(x1, y1, z1);
				GL11.glVertex3f(x1, y1, z1);
				GL11.glEnd();
			}
		}
		
		
		
	}
}

 