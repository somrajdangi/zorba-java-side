package com.inter;

public interface ParentInterface {

	String PARENT_VARIABLE="ParentInterface";
}


interface ChildInterface extends ParentInterface {

	String CHILD_VARIABLE="ChildInterface";
}
