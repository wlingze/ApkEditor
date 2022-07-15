package com.wind.meditor.visitor;

import com.wind.meditor.property.AttributeItem;
import com.wind.meditor.property.ModificationProperty;
import com.wind.meditor.utils.Log;
import com.wind.meditor.utils.NodeValue;
import pxb.android.axml.NodeVisitor;

import java.util.List;

public class ActivityTagVisitor  extends NodeVisitor{

    private List<ModificationProperty.Activity> activityList;

    ActivityTagVisitor(NodeVisitor nv, List<ModificationProperty.Activity> activityList) {
        super(nv);
        Log.d("activitytagvistor");
        this.activityList = activityList;
    }

    @Override
    public void attr(String ns, String name, int resourceId, int type, Object obj) {
        Log.d(" ActivityTagVistor attr  --> ns = " + ns + " name = " +
                name + " resourceId=" + resourceId + " obj = " + obj);
        if (!NodeValue.Activity.PERMISSION.equals(name)) {
            super.attr(ns, name, resourceId, type, obj);
        }
    }
}
