/*******************************************************************************
 * Copyright (c) 2017 Shreyas Patil.
 * All rights reserved. This assessment framework or any portion thereof
 * may not be reproduced or used in any manner whatsoever
 * without the express written permission of the publisher
 * except for the use to review for assessment results by the members of build.com.
 *
 * Contributors:
 *     Shreyas Patil
 *******************************************************************************/
function show(type)
{
    count = 0;
    for (var key in methods) {
        var row = document.getElementById(key);
        if ((methods[key] &  type) != 0) {
            row.style.display = '';
            row.className = (count++ % 2) ? rowColor : altColor;
        }
        else
            row.style.display = 'none';
    }
    updateTabs(type);
}

function updateTabs(type)
{
    for (var value in tabs) {
        var sNode = document.getElementById(tabs[value][0]);
        var spanNode = sNode.firstChild;
        if (value == type) {
            sNode.className = activeTableTab;
            spanNode.innerHTML = tabs[value][1];
        }
        else {
            sNode.className = tableTab;
            spanNode.innerHTML = "<a href=\"javascript:show("+ value + ");\">" + tabs[value][1] + "</a>";
        }
    }
}
