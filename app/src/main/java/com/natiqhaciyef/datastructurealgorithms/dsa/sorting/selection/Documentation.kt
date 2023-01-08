package com.natiqhaciyef.datastructurealgorithms.dsa.sorting.selection

/** Documentation Selection sorting (English)
Selection sort starts with the first element and check the whole list to find smallest element, and when find it
they are changing their places.

[6,4,2,7,5] -> [2,4,6,7,5]        1. 6 and 2  2 is stable now
[2,4,6,7,5] -> [2,4,6,7,5]        2. 4 is stable, because it is in the right place
[2,4,6,7,5] -> [2,4,5,7,6]        3. 6 and 5
[2,4,5,7,6] -> [2,4,5,6,7]        4. 7 and 6
[2,4,5,7,6] -> [2,4,5,6,7]        5. last check for correcting result
 */

/** Selection çeşidləmə alqoritminin dokumentasiyası
Selection çeşidləmə cərgənin önündəki ilk elementdən başlayır və cərgədəki ən kiçik elementi taparaq onla yerdəyişməsini
edir. Sonraki, mərhələdə 2ci element ilə cərgədəki ən kiçik 2ci elementin yerdəyişməsi baş verir və bu cərgə sonunadək
davam edir.

[6,4,2,7,5] -> [2,4,6,7,5]        1. 6 and 2  2 is stable now
[2,4,6,7,5] -> [2,4,6,7,5]        2. 4 is stable, because it is in the right place
[2,4,6,7,5] -> [2,4,5,7,6]        3. 6 and 5
[2,4,5,7,6] -> [2,4,5,6,7]        4. 7 and 6
[2,4,5,7,6] -> [2,4,5,6,7]        5. last check for correcting result
 */