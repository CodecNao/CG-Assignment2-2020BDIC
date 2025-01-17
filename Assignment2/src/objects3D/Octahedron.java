package objects3D;


import org.lwjgl.opengl.GL11;
import GraphicsObjects.Point4f;
import GraphicsObjects.Vector4f;

public class Octahedron {

	
	public Octahedron()
	{
		
	}
	
	
	// Implement using notes and examine Tetrahedron to aid in the coding  look at lecture  7 , 7b and 8 
	public void DrawOctahedron(){
		//set vertices
		Point4f vertices[] = { 	new Point4f(1.0f, 0.0f, 0.0f,0.0f), 
								new Point4f(0.0f, 0.0f, 1.0f,0.0f),
								new Point4f(0.0f, 1.0f, 0.0f,0.0f), 
								new Point4f(-1.0f, 0.0f, 0.0f,0.0f),
								new Point4f(0.0f, 0.0f, -1.0f,0.0f),
								new Point4f(0.0f, -1.0f, 0.0f,0.0f)};
		//set faces
		int[][] faces = { 	{0,1,2}, 
							{1,2,3},
							{1,3,5}, 
							{0,1,5},
							{2,3,4},
							{0,2,4},
							{0,4,5},
							{3,4,5}};
		 //draw all faces and vertices
		GL11.glBegin(GL11.GL_TRIANGLES);
		for (int face = 0; face < 8; face++) { // per face
			Vector4f v = vertices[faces[face][1]].MinusPoint(vertices[faces[face][0]]); 
			Vector4f w = vertices[faces[face][2]].MinusPoint(vertices[faces[face][0]]);
			Vector4f normal = v.cross(w).Normal();
			
		 	GL11.glNormal3f(normal.x, normal.y, normal.z);
		 	
			GL11.glVertex3f(vertices[faces[face][0]].x, vertices[faces[face][0]].y, vertices[faces[face][0]].z);
			GL11.glVertex3f(vertices[faces[face][1]].x, vertices[faces[face][1]].y, vertices[faces[face][1]].z);
			GL11.glVertex3f(vertices[faces[face][2]].x, vertices[faces[face][2]].y, vertices[faces[face][2]].z);
		} 
		// per face
		GL11.glEnd();
		
		
	}
}
 