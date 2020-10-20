package objects3D;

import org.lwjgl.opengl.GL11;
import GraphicsObjects.Point4f;
import GraphicsObjects.Vector4f;

public class Cube {

	
	public Cube() {

	}
	
	// Implement using notes and examine Tetrahedron to aid in the coding  look at lecture  7 , 7b and 8 
	
	//using six plants and its vertexes to draw the cube.
	
	
	
	//zhu shi zai zhe li upupupupup	
	//zhu shi zai zhe li upupupupup	
	//zhu shi zai zhe li upupupupup	
	//zhu shi zai zhe li upupupupup	
	//zhu shi zai zhe li upupupupup	
	//zhu shi zai zhe li upupupupup	
	
	
	public void DrawCube() {
		
		//eight points
		Point4f vertices[] = { 	new Point4f(-1.0f, -1.0f, -1.0f,0.0f), 
								new Point4f(-1.0f, -1.0f, 1.0f,0.0f),
								new Point4f(1.0f, -1.0f, 1.0f,0.0f), 
								new Point4f(1.0f, -1.0f, -1.0f,0.0f),
								new Point4f(-1.0f, 1.0f, -1.0f,0.0f),
								new Point4f(1.0f, 1.0f, -1.0f,0.0f),
								new Point4f(1.0f, 1.0f, 1.0f,0.0f),
								new Point4f(-1.0f, 1.0f, 1.0f,0.0f)};
		
		//sight plants(divided to 12 trangles)

		int[][] faces = { 	{0,1,2}, 
							{0,2,3},
							{5,4,0}, 
							{0,3,5},
							{5,3,2},
							{2,6,5},
							{7,6,2},
							{2,1,7},
							{0,1,7},
							{0,4,7},
							{5,7,4},
							{5,6,7}};
		 //draw faces
		GL11.glBegin(GL11.GL_TRIANGLES);
		for (int face = 0; face < 12; face++) { // per face
			Vector4f v = vertices[faces[face][1]].MinusPoint(vertices[faces[face][0]]); 
			Vector4f w = vertices[faces[face][2]].MinusPoint(vertices[faces[face][0]]);
			Vector4f normal = v.cross(w).Normal();
			
		 	GL11.glNormal3f(normal.x, normal.y, normal.z);
		 	
			GL11.glVertex3f(vertices[faces[face][0]].x, vertices[faces[face][0]].y, vertices[faces[face][0]].z);
			GL11.glVertex3f(vertices[faces[face][1]].x, vertices[faces[face][1]].y, vertices[faces[face][1]].z);
			GL11.glVertex3f(vertices[faces[face][2]].x, vertices[faces[face][2]].y, vertices[faces[face][2]].z);
			// GL11.glVertex3f(vertices[faces[face][3]].x, vertices[faces[face][3]].y,
			// vertices[faces[face][3]].z);
		} 
		// per face
		GL11.glEnd();
		
		
		

	}
	
	
	
}
 
	/*
	 
	 
}

	*/
	 