package com.ch01.testprogram.T5;

import java.util.ArrayList;
import java.util.List;

// Main class for testing the system
/**
 * Repayment Schedule for Loan 1:
 * Payment #1: Principal=812.7091845518489, Interest=666.6666666666667, Total Payment=1479.3758512185157, Remaining Balance=199187.29081544816
 * Payment #2: Principal=815.4182151670218, Interest=663.9576360514939, Total Payment=1479.3758512185157, Remaining Balance=198371.87260028115
 * Payment #3: Principal=818.1362758842452, Interest=661.2395753342705, Total Payment=1479.3758512185157, Remaining Balance=197553.7363243969
 * Payment #4: Principal=820.8633968038594, Interest=658.5124544146563, Total Payment=1479.3758512185157, Remaining Balance=196732.87292759304
 * Payment #5: Principal=823.5996081265388, Interest=655.7762430919769, Total Payment=1479.3758512185157, Remaining Balance=195909.2733194665
 * Payment #6: Principal=826.3449401536272, Interest=653.0309110648884, Total Payment=1479.3758512185157, Remaining Balance=195082.92837931289
 * Payment #7: Principal=829.0994232874726, Interest=650.276427931043, Total Payment=1479.3758512185157, Remaining Balance=194253.82895602542
 * Payment #8: Principal=831.8630880317643, Interest=647.5127631867514, Total Payment=1479.3758512185157, Remaining Balance=193421.96586799365
 * Payment #9: Principal=834.6359649918701, Interest=644.7398862266456, Total Payment=1479.3758512185157, Remaining Balance=192587.32990300178
 * Payment #10: Principal=837.4180848751763, Interest=641.9577663433394, Total Payment=1479.3758512185157, Remaining Balance=191749.9118181266
 * Payment #11: Principal=840.2094784914269, Interest=639.1663727270887, Total Payment=1479.3758512185157, Remaining Balance=190909.70233963517
 * Payment #12: Principal=843.010176753065, Interest=636.3656744654506, Total Payment=1479.3758512185157, Remaining Balance=190066.6921628821
 * Payment #13: Principal=845.8202106755753, Interest=633.5556405429404, Total Payment=1479.3758512185157, Remaining Balance=189220.87195220654
 * Payment #14: Principal=848.6396113778271, Interest=630.7362398406885, Total Payment=1479.3758512185157, Remaining Balance=188372.23234082872
 * Payment #15: Principal=851.4684100824198, Interest=627.9074411360958, Total Payment=1479.3758512185157, Remaining Balance=187520.7639307463
 * Payment #16: Principal=854.306638116028, Interest=625.0692131024877, Total Payment=1479.3758512185157, Remaining Balance=186666.45729263028
 * Payment #17: Principal=857.1543269097481, Interest=622.2215243087676, Total Payment=1479.3758512185157, Remaining Balance=185809.30296572053
 * Payment #18: Principal=860.0115079994472, Interest=619.3643432190685, Total Payment=1479.3758512185157, Remaining Balance=184949.2914577211
 * Payment #19: Principal=862.878213026112, Interest=616.4976381924037, Total Payment=1479.3758512185157, Remaining Balance=184086.41324469497
 * Payment #20: Principal=865.7544737361991, Interest=613.6213774823166, Total Payment=1479.3758512185157, Remaining Balance=183220.65877095878
 * Payment #21: Principal=868.6403219819864, Interest=610.7355292365293, Total Payment=1479.3758512185157, Remaining Balance=182352.0184489768
 * Payment #22: Principal=871.5357897219263, Interest=607.8400614965893, Total Payment=1479.3758512185157, Remaining Balance=181480.48265925486
 * Payment #23: Principal=874.4409090209994, Interest=604.9349421975163, Total Payment=1479.3758512185157, Remaining Balance=180606.04175023385
 * Payment #24: Principal=877.3557120510694, Interest=602.0201391674462, Total Payment=1479.3758512185157, Remaining Balance=179728.6860381828
 * Payment #25: Principal=880.2802310912397, Interest=599.095620127276, Total Payment=1479.3758512185157, Remaining Balance=178848.40580709153
 * Payment #26: Principal=883.2144985282105, Interest=596.1613526903052, Total Payment=1479.3758512185157, Remaining Balance=177965.1913085633
 * Payment #27: Principal=886.1585468566379, Interest=593.2173043618777, Total Payment=1479.3758512185157, Remaining Balance=177079.03276170668
 * Payment #28: Principal=889.1124086794933, Interest=590.2634425390223, Total Payment=1479.3758512185157, Remaining Balance=176189.92035302718
 * Payment #29: Principal=892.076116708425, Interest=587.2997345100906, Total Payment=1479.3758512185157, Remaining Balance=175297.84423631875
 * Payment #30: Principal=895.0497037641198, Interest=584.3261474543958, Total Payment=1479.3758512185157, Remaining Balance=174402.79453255463
 * Payment #31: Principal=898.0332027766668, Interest=581.3426484418488, Total Payment=1479.3758512185157, Remaining Balance=173504.76132977798
 * Payment #32: Principal=901.0266467859224, Interest=578.3492044325933, Total Payment=1479.3758512185157, Remaining Balance=172603.73468299204
 * Payment #33: Principal=904.0300689418755, Interest=575.3457822766402, Total Payment=1479.3758512185157, Remaining Balance=171699.70461405016
 * Payment #34: Principal=907.0435025050151, Interest=572.3323487135006, Total Payment=1479.3758512185157, Remaining Balance=170792.66111154514
 * Payment #35: Principal=910.0669808466985, Interest=569.3088703718172, Total Payment=1479.3758512185157, Remaining Balance=169882.59413069845
 * Payment #36: Principal=913.1005374495209, Interest=566.2753137689948, Total Payment=1479.3758512185157, Remaining Balance=168969.49359324892
 * Payment #37: Principal=916.1442059076859, Interest=563.2316453108298, Total Payment=1479.3758512185157, Remaining Balance=168053.34938734124
 * Payment #38: Principal=919.1980199273781, Interest=560.1778312911375, Total Payment=1479.3758512185157, Remaining Balance=167134.15136741387
 * Payment #39: Principal=922.2620133271361, Interest=557.1138378913796, Total Payment=1479.3758512185157, Remaining Balance=166211.88935408674
 * Payment #40: Principal=925.3362200382264, Interest=554.0396311802892, Total Payment=1479.3758512185157, Remaining Balance=165286.5531340485
 * Payment #41: Principal=928.4206741050206, Interest=550.9551771134951, Total Payment=1479.3758512185157, Remaining Balance=164358.13245994347
 * Payment #42: Principal=931.5154096853707, Interest=547.8604415331449, Total Payment=1479.3758512185157, Remaining Balance=163426.6170502581
 * Payment #43: Principal=934.6204610509886, Interest=544.755390167527, Total Payment=1479.3758512185157, Remaining Balance=162491.9965892071
 * Payment #44: Principal=937.7358625878253, Interest=541.6399886306904, Total Payment=1479.3758512185157, Remaining Balance=161554.26072661928
 * Payment #45: Principal=940.8616487964514, Interest=538.5142024220643, Total Payment=1479.3758512185157, Remaining Balance=160613.39907782283
 * Payment #46: Principal=943.9978542924396, Interest=535.3779969260761, Total Payment=1479.3758512185157, Remaining Balance=159669.40122353038
 * Payment #47: Principal=947.1445138067477, Interest=532.231337411768, Total Payment=1479.3758512185157, Remaining Balance=158722.25670972365
 * Payment #48: Principal=950.3016621861035, Interest=529.0741890324122, Total Payment=1479.3758512185157, Remaining Balance=157771.95504753754
 * Payment #49: Principal=953.4693343933905, Interest=525.9065168251252, Total Payment=1479.3758512185157, Remaining Balance=156818.48571314415
 * Payment #50: Principal=956.6475655080351, Interest=522.7282857104806, Total Payment=1479.3758512185157, Remaining Balance=155861.83814763612
 * ...
 * Repayment Schedule for Loan 2:
 * Payment #1: Principal=940.3941694071975, Interest=687.5, Total Payment=1627.8941694071975, Remaining Balance=149059.6058305928
 * Payment #2: Principal=944.7043093503138, Interest=683.1898600568837, Total Payment=1627.8941694071975, Remaining Balance=148114.9015212425
 * Payment #3: Principal=949.0342041015028, Interest=678.8599653056947, Total Payment=1627.8941694071975, Remaining Balance=147165.86731714098
 * Payment #4: Principal=953.3839442036348, Interest=674.5102252035628, Total Payment=1627.8941694071975, Remaining Balance=146212.48337293733
 * Payment #5: Principal=957.753620614568, Interest=670.1405487926295, Total Payment=1627.8941694071975, Remaining Balance=145254.72975232278
 * Payment #6: Principal=962.1433247090515, Interest=665.750844698146, Total Payment=1627.8941694071975, Remaining Balance=144292.5864276137
 * Payment #7: Principal=966.5531482806347, Interest=661.3410211265629, Total Payment=1627.8941694071975, Remaining Balance=143326.0332793331
 * Payment #8: Principal=970.9831835435875, Interest=656.91098586361, Total Payment=1627.8941694071975, Remaining Balance=142355.0500957895
 * Payment #9: Principal=975.4335231348289, Interest=652.4606462723686, Total Payment=1627.8941694071975, Remaining Balance=141379.6165726547
 * Payment #10: Principal=979.9042601158635, Interest=647.989909291334, Total Payment=1627.8941694071975, Remaining Balance=140399.71231253882
 * Payment #11: Principal=984.395487974728, Interest=643.4986814324695, Total Payment=1627.8941694071975, Remaining Balance=139415.3168245641
 * Payment #12: Principal=988.9073006279453, Interest=638.9868687792522, Total Payment=1627.8941694071975, Remaining Balance=138426.40952393616
 * Payment #13: Principal=993.4397924224901, Interest=634.4543769847074, Total Payment=1627.8941694071975, Remaining Balance=137432.96973151367
 * Payment #14: Principal=997.9930581377598, Interest=629.9011112694377, Total Payment=1627.8941694071975, Remaining Balance=136434.9766733759
 * Payment #15: Principal=1002.567192987558, Interest=625.3269764196395, Total Payment=1627.8941694071975, Remaining Balance=135432.40948038833
 * Payment #16: Principal=1007.1622926220844, Interest=620.7318767851132, Total Payment=1627.8941694071975, Remaining Balance=134425.24718776625
 * Payment #17: Principal=1011.7784531299355, Interest=616.115716277262, Total Payment=1627.8941694071975, Remaining Balance=133413.46873463632
 * Payment #18: Principal=1016.4157710401144, Interest=611.4783983670832, Total Payment=1627.8941694071975, Remaining Balance=132397.05296359622
 * Payment #19: Principal=1021.0743433240482, Interest=606.8198260831493, Total Payment=1627.8941694071975, Remaining Balance=131375.97862027216
 * Payment #20: Principal=1025.7542673976168, Interest=602.1399020095807, Total Payment=1627.8941694071975, Remaining Balance=130350.22435287455
 * Payment #21: Principal=1030.4556411231893, Interest=597.4385282840084, Total Payment=1627.8941694071975, Remaining Balance=129319.76871175136
 * Payment #22: Principal=1035.1785628116704, Interest=592.7156065955271, Total Payment=1627.8941694071975, Remaining Balance=128284.5901489397
 * Payment #23: Principal=1039.9231312245572, Interest=587.9710381826403, Total Payment=1627.8941694071975, Remaining Balance=127244.66701771514
 * Payment #24: Principal=1044.689445576003, Interest=583.2047238311944, Total Payment=1627.8941694071975, Remaining Balance=126199.97757213913
 * Payment #25: Principal=1049.4776055348932, Interest=578.4165638723043, Total Payment=1627.8941694071975, Remaining Balance=125150.49996660424
 * Payment #26: Principal=1054.287711226928, Interest=573.6064581802694, Total Payment=1627.8941694071975, Remaining Balance=124096.21225537731
 * Payment #27: Principal=1059.1198632367182, Interest=568.7743061704793, Total Payment=1627.8941694071975, Remaining Balance=123037.09239214059
 * Payment #28: Principal=1063.9741626098864, Interest=563.9200067973111, Total Payment=1627.8941694071975, Remaining Balance=121973.11822953071
 * Payment #29: Principal=1068.8507108551817, Interest=559.0434585520157, Total Payment=1627.8941694071975, Remaining Balance=120904.26751867552
 * Payment #30: Principal=1073.7496099466014, Interest=554.1445594605962, Total Payment=1627.8941694071975, Remaining Balance=119830.51790872891
 * Payment #31: Principal=1078.6709623255233, Interest=549.2232070816742, Total Payment=1627.8941694071975, Remaining Balance=118751.84694640338
 * Payment #32: Principal=1083.6148709028487, Interest=544.2792985043488, Total Payment=1627.8941694071975, Remaining Balance=117668.23207550053
 * Payment #33: Principal=1088.5814390611536, Interest=539.3127303460441, Total Payment=1627.8941694071975, Remaining Balance=116579.65063643939
 * Payment #34: Principal=1093.5707706568503, Interest=534.3233987503472, Total Payment=1627.8941694071975, Remaining Balance=115486.07986578254
 * Payment #35: Principal=1098.5829700223608, Interest=529.3111993848366, Total Payment=1627.8941694071975, Remaining Balance=114387.49689576018
 * Payment #36: Principal=1103.6181419682966, Interest=524.2760274389009, Total Payment=1627.8941694071975, Remaining Balance=113283.87875379188
 * Payment #37: Principal=1108.6763917856515, Interest=519.2177776215461, Total Payment=1627.8941694071975, Remaining Balance=112175.20236200624
 * Payment #38: Principal=1113.7578252480023, Interest=514.1363441591952, Total Payment=1627.8941694071975, Remaining Balance=111061.44453675824
 * Payment #39: Principal=1118.8625486137223, Interest=509.03162079347527, Total Payment=1627.8941694071975, Remaining Balance=109942.58198814452
 * Payment #40: Principal=1123.9906686282018, Interest=503.90350077899575, Total Payment=1627.8941694071975, Remaining Balance=108818.59131951632
 * Payment #41: Principal=1129.142292526081, Interest=498.75187688111646, Total Payment=1627.8941694071975, Remaining Balance=107689.44902699023
 * Payment #42: Principal=1134.3175280334922, Interest=493.57664137370523, Total Payment=1627.8941694071975, Remaining Balance=106555.13149895673
 * Payment #43: Principal=1139.5164833703125, Interest=488.37768603688505, Total Payment=1627.8941694071975, Remaining Balance=105415.61501558642
 * Payment #44: Principal=1144.7392672524265, Interest=483.1549021547711, Total Payment=1627.8941694071975, Remaining Balance=104270.87574833399
 * Payment #45: Principal=1149.985988894, Interest=477.90818051319746, Total Payment=1627.8941694071975, Remaining Balance=103120.88975943999
 * Payment #46: Principal=1155.2567580097643, Interest=472.6374113974333, Total Payment=1627.8941694071975, Remaining Balance=101965.63300143022
 * Payment #47: Principal=1160.551684817309, Interest=467.3424845898885, Total Payment=1627.8941694071975, Remaining Balance=100805.08131661291
 * Payment #48: Principal=1165.8708800393883, Interest=462.0232893678092, Total Payment=1627.8941694071975, Remaining Balance=99639.21043657351
 * Payment #49: Principal=1171.2144549062355, Interest=456.67971450096195, Total Payment=1627.8941694071975, Remaining Balance=98467.99598166728
 * Payment #50: Principal=1176.5825211578892, Interest=451.31164824930835, Total Payment=1627.8941694071975, Remaining Balance=97291.41346050939
 * ...
 * Repayment Schedule for Loan 3:
 * Payment #1: Principal=622.3936746136924, Interest=1000.0, Total Payment=1622.3936746136924, Remaining Balance=249377.6063253863
 * Payment #2: Principal=624.8832493121472, Interest=997.5104253015452, Total Payment=1622.3936746136924, Remaining Balance=248752.72307607415
 * Payment #3: Principal=627.3827823093958, Interest=995.0108923042966, Total Payment=1622.3936746136924, Remaining Balance=248125.34029376475
 * Payment #4: Principal=629.8923134386333, Interest=992.5013611750591, Total Payment=1622.3936746136924, Remaining Balance=247495.4479803261
 * Payment #5: Principal=632.411882692388, Interest=989.9817919213044, Total Payment=1622.3936746136924, Remaining Balance=246863.0360976337
 * Payment #6: Principal=634.9415302231575, Interest=987.4521443905348, Total Payment=1622.3936746136924, Remaining Balance=246228.09456741056
 * Payment #7: Principal=637.4812963440501, Interest=984.9123782696423, Total Payment=1622.3936746136924, Remaining Balance=245590.6132710665
 * Payment #8: Principal=640.0312215294263, Interest=982.3624530842661, Total Payment=1622.3936746136924, Remaining Balance=244950.58204953707
 * Payment #9: Principal=642.5913464155441, Interest=979.8023281981483, Total Payment=1622.3936746136924, Remaining Balance=244307.99070312153
 * Payment #10: Principal=645.1617118012063, Interest=977.2319628124861, Total Payment=1622.3936746136924, Remaining Balance=243662.82899132033
 * Payment #11: Principal=647.742358648411, Interest=974.6513159652814, Total Payment=1622.3936746136924, Remaining Balance=243015.0866326719
 * Payment #12: Principal=650.3333280830047, Interest=972.0603465306876, Total Payment=1622.3936746136924, Remaining Balance=242364.7533045889
 * Payment #13: Principal=652.9346613953368, Interest=969.4590132183556, Total Payment=1622.3936746136924, Remaining Balance=241711.81864319358
 * Payment #14: Principal=655.5464000409181, Interest=966.8472745727743, Total Payment=1622.3936746136924, Remaining Balance=241056.27224315266
 * Payment #15: Principal=658.1685856410817, Interest=964.2250889726107, Total Payment=1622.3936746136924, Remaining Balance=240398.1036575116
 * Payment #16: Principal=660.801259983646, Interest=961.5924146300464, Total Payment=1622.3936746136924, Remaining Balance=239737.30239752794
 * Payment #17: Principal=663.4444650235806, Interest=958.9492095901118, Total Payment=1622.3936746136924, Remaining Balance=239073.85793250435
 * Payment #18: Principal=666.098242883675, Interest=956.2954317300174, Total Payment=1622.3936746136924, Remaining Balance=238407.75968962067
 * Payment #19: Principal=668.7626358552097, Interest=953.6310387584826, Total Payment=1622.3936746136924, Remaining Balance=237738.99705376546
 * Payment #20: Principal=671.4376863986305, Interest=950.9559882150619, Total Payment=1622.3936746136924, Remaining Balance=237067.55936736683
 * Payment #21: Principal=674.123437144225, Interest=948.2702374694674, Total Payment=1622.3936746136924, Remaining Balance=236393.43593022262
 * Payment #22: Principal=676.8199308928018, Interest=945.5737437208905, Total Payment=1622.3936746136924, Remaining Balance=235716.6159993298
 * Payment #23: Principal=679.5272106163732, Interest=942.8664639973192, Total Payment=1622.3936746136924, Remaining Balance=235037.08878871344
 * Payment #24: Principal=682.2453194588386, Interest=940.1483551548538, Total Payment=1622.3936746136924, Remaining Balance=234354.8434692546
 * Payment #25: Principal=684.9743007366739, Interest=937.4193738770185, Total Payment=1622.3936746136924, Remaining Balance=233669.86916851794
 * Payment #26: Principal=687.7141979396206, Interest=934.6794766740718, Total Payment=1622.3936746136924, Remaining Balance=232982.15497057833
 * Payment #27: Principal=690.465054731379, Interest=931.9286198823133, Total Payment=1622.3936746136924, Remaining Balance=232291.68991584695
 * Payment #28: Principal=693.2269149503046, Interest=929.1667596633878, Total Payment=1622.3936746136924, Remaining Balance=231598.46300089665
 * Payment #29: Principal=695.9998226101058, Interest=926.3938520035866, Total Payment=1622.3936746136924, Remaining Balance=230902.46317828653
 * Payment #30: Principal=698.7838219005463, Interest=923.6098527131461, Total Payment=1622.3936746136924, Remaining Balance=230203.67935638598
 * Payment #31: Principal=701.5789571881485, Interest=920.8147174255439, Total Payment=1622.3936746136924, Remaining Balance=229502.10039919784
 * Payment #32: Principal=704.385273016901, Interest=918.0084015967914, Total Payment=1622.3936746136924, Remaining Balance=228797.71512618093
 * Payment #33: Principal=707.2028141089686, Interest=915.1908605047238, Total Payment=1622.3936746136924, Remaining Balance=228090.51231207198
 * Payment #34: Principal=710.0316253654045, Interest=912.3620492482879, Total Payment=1622.3936746136924, Remaining Balance=227380.48068670658
 * Payment #35: Principal=712.871751866866, Interest=909.5219227468264, Total Payment=1622.3936746136924, Remaining Balance=226667.60893483972
 * Payment #36: Principal=715.7232388743334, Interest=906.6704357393589, Total Payment=1622.3936746136924, Remaining Balance=225951.88569596538
 * Payment #37: Principal=718.5861318298308, Interest=903.8075427838615, Total Payment=1622.3936746136924, Remaining Balance=225233.29956413555
 * Payment #38: Principal=721.4604763571501, Interest=900.9331982565423, Total Payment=1622.3936746136924, Remaining Balance=224511.8390877784
 * Payment #39: Principal=724.3463182625787, Interest=898.0473563511136, Total Payment=1622.3936746136924, Remaining Balance=223787.49276951584
 * Payment #40: Principal=727.243703535629, Interest=895.1499710780633, Total Payment=1622.3936746136924, Remaining Balance=223060.2490659802
 * Payment #41: Principal=730.1526783497716, Interest=892.2409962639208, Total Payment=1622.3936746136924, Remaining Balance=222330.09638763042
 * Payment #42: Principal=733.0732890631707, Interest=889.3203855505217, Total Payment=1622.3936746136924, Remaining Balance=221597.02309856724
 * Payment #43: Principal=736.0055822194234, Interest=886.3880923942689, Total Payment=1622.3936746136924, Remaining Balance=220861.0175163478
 * Payment #44: Principal=738.9496045483011, Interest=883.4440700653913, Total Payment=1622.3936746136924, Remaining Balance=220122.0679117995
 * Payment #45: Principal=741.9054029664943, Interest=880.4882716471981, Total Payment=1622.3936746136924, Remaining Balance=219380.16250883302
 * Payment #46: Principal=744.8730245783603, Interest=877.5206500353321, Total Payment=1622.3936746136924, Remaining Balance=218635.28948425467
 * Payment #47: Principal=747.8525166766736, Interest=874.5411579370187, Total Payment=1622.3936746136924, Remaining Balance=217887.436967578
 * Payment #48: Principal=750.8439267433804, Interest=871.549747870312, Total Payment=1622.3936746136924, Remaining Balance=217136.59304083462
 * Payment #49: Principal=753.8473024503539, Interest=868.5463721633384, Total Payment=1622.3936746136924, Remaining Balance=216382.74573838426
 * Payment #50: Principal=756.8626916601553, Interest=865.5309829535371, Total Payment=1622.3936746136924, Remaining Balance=215625.8830467241
 * ...
 * Repayment Schedule for Loan 4:
 * Payment #1: Principal=144.30140148551448, Interest=500.0, Total Payment=644.3014014855145, Remaining Balance=99855.69859851449
 * Payment #2: Principal=145.022908492942, Interest=499.27849299257247, Total Payment=644.3014014855145, Remaining Balance=99710.67569002154
 * Payment #3: Principal=145.7480230354068, Interest=498.5533784501077, Total Payment=644.3014014855145, Remaining Balance=99564.92766698613
 * Payment #4: Principal=146.47676315058385, Interest=497.8246383349306, Total Payment=644.3014014855145, Remaining Balance=99418.45090383555
 * Payment #5: Principal=147.20914696633673, Interest=497.09225451917774, Total Payment=644.3014014855145, Remaining Balance=99271.2417568692
 * Payment #6: Principal=147.94519270116842, Interest=496.35620878434605, Total Payment=644.3014014855145, Remaining Balance=99123.29656416803
 * Payment #7: Principal=148.68491866467429, Interest=495.6164828208402, Total Payment=644.3014014855145, Remaining Balance=98974.61164550336
 * Payment #8: Principal=149.42834325799765, Interest=494.8730582275168, Total Payment=644.3014014855145, Remaining Balance=98825.18330224536
 * Payment #9: Principal=150.17548497428766, Interest=494.1259165112268, Total Payment=644.3014014855145, Remaining Balance=98675.00781727108
 * Payment #10: Principal=150.92636239915907, Interest=493.3750390863554, Total Payment=644.3014014855145, Remaining Balance=98524.08145487192
 * Payment #11: Principal=151.68099421115488, Interest=492.6204072743596, Total Payment=644.3014014855145, Remaining Balance=98372.40046066076
 * Payment #12: Principal=152.43939918221065, Interest=491.8620023033038, Total Payment=644.3014014855145, Remaining Balance=98219.96106147855
 * Payment #13: Principal=153.20159617812175, Interest=491.0998053073927, Total Payment=644.3014014855145, Remaining Balance=98066.75946530042
 * Payment #14: Principal=153.96760415901235, Interest=490.3337973265021, Total Payment=644.3014014855145, Remaining Balance=97912.7918611414
 * Payment #15: Principal=154.73744217980743, Interest=489.56395930570704, Total Payment=644.3014014855145, Remaining Balance=97758.0544189616
 * Payment #16: Principal=155.51112939070646, Interest=488.790272094808, Total Payment=644.3014014855145, Remaining Balance=97602.5432895709
 * Payment #17: Principal=156.28868503766, Interest=488.0127164478545, Total Payment=644.3014014855145, Remaining Balance=97446.25460453323
 * Payment #18: Principal=157.07012846284834, Interest=487.23127302266613, Total Payment=644.3014014855145, Remaining Balance=97289.18447607038
 * Payment #19: Principal=157.85547910516254, Interest=486.44592238035193, Total Payment=644.3014014855145, Remaining Balance=97131.32899696523
 * Payment #20: Principal=158.64475650068835, Interest=485.65664498482613, Total Payment=644.3014014855145, Remaining Balance=96972.68424046454
 * Payment #21: Principal=159.43798028319173, Interest=484.86342120232274, Total Payment=644.3014014855145, Remaining Balance=96813.24626018135
 * Payment #22: Principal=160.23517018460774, Interest=484.06623130090674, Total Payment=644.3014014855145, Remaining Balance=96653.01108999674
 * Payment #23: Principal=161.03634603553076, Interest=483.2650554499837, Total Payment=644.3014014855145, Remaining Balance=96491.97474396121
 * Payment #24: Principal=161.8415277657084, Interest=482.45987371980607, Total Payment=644.3014014855145, Remaining Balance=96330.1332161955
 * Payment #25: Principal=162.65073540453693, Interest=481.65066608097754, Total Payment=644.3014014855145, Remaining Balance=96167.48248079098
 * Payment #26: Principal=163.4639890815596, Interest=480.8374124039549, Total Payment=644.3014014855145, Remaining Balance=96004.01849170942
 * Payment #27: Principal=164.2813090269674, Interest=480.0200924585471, Total Payment=644.3014014855145, Remaining Balance=95839.73718268245
 * Payment #28: Principal=165.10271557210223, Interest=479.19868591341225, Total Payment=644.3014014855145, Remaining Balance=95674.63446711034
 * Payment #29: Principal=165.92822914996276, Interest=478.3731723355517, Total Payment=644.3014014855145, Remaining Balance=95508.70623796037
 * Payment #30: Principal=166.75787029571262, Interest=477.54353118980185, Total Payment=644.3014014855145, Remaining Balance=95341.94836766466
 * Payment #31: Principal=167.59165964719114, Interest=476.70974183832334, Total Payment=644.3014014855145, Remaining Balance=95174.35670801747
 * Payment #32: Principal=168.42961794542714, Interest=475.87178354008734, Total Payment=644.3014014855145, Remaining Balance=95005.92709007204
 * Payment #33: Principal=169.27176603515426, Interest=475.0296354503602, Total Payment=644.3014014855145, Remaining Balance=94836.6553240369
 * Payment #34: Principal=170.11812486533, Interest=474.1832766201845, Total Payment=644.3014014855145, Remaining Balance=94666.53719917157
 * Payment #35: Principal=170.96871548965663, Interest=473.33268599585784, Total Payment=644.3014014855145, Remaining Balance=94495.56848368191
 * Payment #36: Principal=171.8235590671049, Interest=472.4778424184096, Total Payment=644.3014014855145, Remaining Balance=94323.7449246148
 * Payment #37: Principal=172.68267686244047, Interest=471.618724623074, Total Payment=644.3014014855145, Remaining Balance=94151.06224775236
 * Payment #38: Principal=173.54609024675267, Interest=470.7553112387618, Total Payment=644.3014014855145, Remaining Balance=93977.51615750561
 * Payment #39: Principal=174.4138206979864, Interest=469.88758078752807, Total Payment=644.3014014855145, Remaining Balance=93803.10233680763
 * Payment #40: Principal=175.28588980147634, Interest=469.01551168403813, Total Payment=644.3014014855145, Remaining Balance=93627.81644700615
 * Payment #41: Principal=176.16231925048373, Interest=468.13908223503074, Total Payment=644.3014014855145, Remaining Balance=93451.65412775567
 * Payment #42: Principal=177.04313084673612, Interest=467.25827063877836, Total Payment=644.3014014855145, Remaining Balance=93274.61099690893
 * Payment #43: Principal=177.92834650096984, Interest=466.37305498454464, Total Payment=644.3014014855145, Remaining Balance=93096.68265040797
 * Payment #44: Principal=178.81798823347464, Interest=465.48341325203984, Total Payment=644.3014014855145, Remaining Balance=92917.86466217448
 * Payment #45: Principal=179.71207817464204, Interest=464.58932331087243, Total Payment=644.3014014855145, Remaining Balance=92738.15258399984
 * Payment #46: Principal=180.61063856551527, Interest=463.6907629199992, Total Payment=644.3014014855145, Remaining Balance=92557.54194543432
 * Payment #47: Principal=181.51369175834287, Interest=462.7877097271716, Total Payment=644.3014014855145, Remaining Balance=92376.02825367598
 * Payment #48: Principal=182.4212602171346, Interest=461.8801412683799, Total Payment=644.3014014855145, Remaining Balance=92193.60699345884
 * Payment #49: Principal=183.33336651822026, Interest=460.9680349672942, Total Payment=644.3014014855145, Remaining Balance=92010.27362694063
 * Payment #50: Principal=184.2500333508113, Interest=460.0513681347032, Total Payment=644.3014014855145, Remaining Balance=91826.02359358982
 * ...
 * Processing payment of 2000.0 for loan ID: 1000
 * Refunding payment of 1500.0 for loan ID: 1001
 * Processing payment of 2500.0 for loan ID: 1002
 * Refunding payment of 1000.0 for loan ID: 1003
 * Total Debt: 700000.0
 * Average Interest Rate: 5.5
 * Portfolio Risk Score: 3.95
 * Loan 1 with Insurance: Loan{loanId=1000, customerId=101, amount=200000.0, termInYears=15, interestRate=5.0, riskScore=3.5, insuranceType='Life Insurance', insuranceAmount=5000.0}
 * Loan 2 with Insurance: Loan{loanId=1001, customerId=102, amount=150000.0, termInYears=10, interestRate=6.0, riskScore=4.0, insuranceType='Property Insurance', insuranceAmount=3000.0}
 * Loan 3 with Insurance: Loan{loanId=1002, customerId=103, amount=250000.0, termInYears=20, interestRate=4.0, riskScore=3.8, insuranceType='Health Insurance', insuranceAmount=4000.0}
 * Loan 4 with Insurance: Loan{loanId=1003, customerId=104, amount=100000.0, termInYears=25, interestRate=7.0, riskScore=4.5, insuranceType='Disability Insurance', insuranceAmount=3500.0}
 * Numbers are in descending order.
 * The sum of the numbers is odd.
 * All numbers are positive.
 * The product of the numbers is less than or equal to 1000.
 * At least one number is even.
 * Numbers are in ascending order.
 * The sum of the numbers is odd.
 * All numbers are positive.
 * The product of the numbers is less than or equal to 1000.
 * At least one number is even.
 * All numbers are equal.
 * The sum of the numbers is odd.
 * All numbers are positive.
 * The product of the numbers is less than or equal to 1000.
 * All numbers are odd.
 * Numbers are in ascending order.
 * The sum of the numbers is even.
 * All numbers are positive.
 * The product of the numbers is less than or equal to 1000.
 * At least one number is even.
 * Numbers are in ascending order.
 * The sum of the numbers is odd.
 * All numbers are negative.
 * The product of the numbers is less than or equal to 1000.
 * At least one number is even.
 * Numbers are in ascending order.
 * The sum of the numbers is odd.
 * The product of the numbers is less than or equal to 1000.
 * At least one number is even.
 * All numbers are equal.
 * The sum of the numbers is even.
 * The product of the numbers is less than or equal to 1000.
 * At least one number is even.
 * All numbers are equal.
 * The sum of the numbers is even.
 * All numbers are positive.
 * The product of the numbers is less than or equal to 1000.
 * At least one number is even.
 * Numbers are in ascending order.
 * The sum of the numbers is odd.
 * All numbers are positive.
 * The product of the numbers is less than or equal to 1000.
 * All numbers are odd.
 * Numbers are in ascending order.
 * The sum of the numbers is even.
 * All numbers are positive.
 * The product of the numbers is greater than 1000.
 * At least one number is even.
 */
public class T5 {  // LoanManagement
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        LoanManager loanManager = new LoanManager();
        RiskEvaluator riskEvaluator = new RiskEvaluator();
        InterestCalculator interestCalculator = new InterestCalculator();
        RepaymentScheduleGenerator repaymentScheduleGenerator = new RepaymentScheduleGenerator();
        LoanPortfolio loanPortfolio = new LoanPortfolio();
        PaymentGateway paymentGateway = new PaymentGateway();
        InsuranceManager insuranceManager = new InsuranceManager();
        ComplexChecker complexChecker = new ComplexChecker();

        // Creating customers
        Customer customer1 = customerManager.createCustomer(101, "John Doe", 35, 750, 60000);
        Customer customer2 = customerManager.createCustomer(102, "Jane Smith", 28, 680, 45000);
        Customer customer3 = customerManager.createCustomer(103, "Alice Johnson", 45, 800, 85000);
        Customer customer4 = customerManager.createCustomer(104, "Bob Brown", 50, 620, 40000);

        // Applying for loans
        Loan loan1 = loanManager.applyForLoan(101, 200000, 15, 5, 3.5);
        Loan loan2 = loanManager.applyForLoan(102, 150000, 10, 6, 4.0);
        Loan loan3 = loanManager.applyForLoan(103, 250000, 20, 4, 3.8);
        Loan loan4 = loanManager.applyForLoan(104, 100000, 25, 7, 4.5);

        // Adding loans to the portfolio
        loanPortfolio.addLoan(loan1);
        loanPortfolio.addLoan(loan2);
        loanPortfolio.addLoan(loan3);
        loanPortfolio.addLoan(loan4);

        // Evaluating risks with complex conditions
        double riskScore1 = riskEvaluator.evaluateRisk(750, 200000, 15, 80, 3, 20, 5);
        double riskScore2 = riskEvaluator.evaluateRisk(680, 150000, 10, 70, 4, 15, 2);
        double riskScore3 = riskEvaluator.evaluateRisk(800, 250000, 20, 85, 1, 10, 0);
        double riskScore4 = riskEvaluator.evaluateRisk(620, 100000, 25, 65, 6, 25, 3);

        // Calculating interest rates with complex conditions
        double interestRate1 = interestCalculator.calculateInterestRate(750, 15, 200000, 3.5, 5);
        double interestRate2 = interestCalculator.calculateInterestRate(680, 10, 150000, 4.0, 6);
        double interestRate3 = interestCalculator.calculateInterestRate(800, 20, 250000, 3.8, 4);
        double interestRate4 = interestCalculator.calculateInterestRate(620, 25, 100000, 4.5, 7);

        // Generating repayment schedules
        List<RepaymentSchedule> schedule1 = repaymentScheduleGenerator.generateSchedule(200000, interestRate1, 15, 12);
        List<RepaymentSchedule> schedule2 = repaymentScheduleGenerator.generateSchedule(150000, interestRate2, 10, 12);
        List<RepaymentSchedule> schedule3 = repaymentScheduleGenerator.generateSchedule(250000, interestRate3, 20, 12);
        List<RepaymentSchedule> schedule4 = repaymentScheduleGenerator.generateSchedule(100000, interestRate4, 25, 12);

        // Printing repayment schedules
        System.out.println("Repayment Schedule for Loan 1:");
        for (RepaymentSchedule rs : schedule1) {
            System.out.println(rs);
        }

        System.out.println("Repayment Schedule for Loan 2:");
        for (RepaymentSchedule rs : schedule2) {
            System.out.println(rs);
        }

        System.out.println("Repayment Schedule for Loan 3:");
        for (RepaymentSchedule rs : schedule3) {
            System.out.println(rs);
        }

        System.out.println("Repayment Schedule for Loan 4:");
        for (RepaymentSchedule rs : schedule4) {
            System.out.println(rs);
        }

        // Processing payments with complex conditions
        paymentGateway.processPayment(loan1.getLoanId(), 2000);
        paymentGateway.refundPayment(loan2.getLoanId(), 1500);
        paymentGateway.processPayment(loan3.getLoanId(), 2500);
        paymentGateway.refundPayment(loan4.getLoanId(), 1000);

        // Loan portfolio management
        System.out.println("Total Debt: " + loanPortfolio.calculateTotalDebt());
        System.out.println("Average Interest Rate: " + loanPortfolio.calculateAverageInterestRate());
        System.out.println("Portfolio Risk Score: " + loanPortfolio.evaluatePortfolioRisk());

        // Adding insurance to loans
        insuranceManager.addInsuranceToLoan(loan1, "Life Insurance", 5000);
        insuranceManager.addInsuranceToLoan(loan2, "Property Insurance", 3000);
        insuranceManager.addInsuranceToLoan(loan3, "Health Insurance", 4000);
        insuranceManager.addInsuranceToLoan(loan4, "Disability Insurance", 3500);

        // Checking loan details with insurance
        System.out.println("Loan 1 with Insurance: " + loan1);
        System.out.println("Loan 2 with Insurance: " + loan2);
        System.out.println("Loan 3 with Insurance: " + loan3);
        System.out.println("Loan 4 with Insurance: " + loan4);

        // Complex boundary check
        complexChecker.complexCheck(5, 4, 3, 2, 1); // Example of descending order
        complexChecker.complexCheck(1, 2, 3, 4, 5); // Example of ascending order
        complexChecker.complexCheck(1, 1, 1, 1, 1); // Example of all equal
        complexChecker.complexCheck(1, 2, 3, 4, 6); // Example of all different

        // Additional boundary checks to extend the code
        complexChecker.complexCheck(-5, -4, -3, -2, -1); // Negative descending
        complexChecker.complexCheck(-1, 0, 1, 2, 3); // Mixed positive and negative
        complexChecker.complexCheck(0, 0, 0, 0, 0); // All zeroes
        complexChecker.complexCheck(1000, 1000, 1000, 1000, 1000); // Large equal numbers
        complexChecker.complexCheck(1, 3, 5, 7, 9); // All odd numbers
        complexChecker.complexCheck(2, 4, 6, 8, 10); // All even numbers
    }
}

// Customer class
class Customer {
    private int customerId;
    private String name;
    private int age;
    private int creditScore;
    private double annualIncome;

    public Customer(int customerId, String name, int age, int creditScore, double annualIncome) {
        this.customerId = customerId;
        this.name = name;
        this.age = age;
        this.creditScore = creditScore;
        this.annualIncome = annualIncome;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public double getAnnualIncome() {
        return annualIncome;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", creditScore=" + creditScore +
                ", annualIncome=" + annualIncome +
                '}';
    }
}

// Loan class
class Loan {
    private int loanId;
    private int customerId;
    private double amount;
    private int termInYears;
    private double interestRate;
    private double riskScore;
    private String insuranceType;
    private double insuranceAmount;

    public Loan(int loanId, int customerId, double amount, int termInYears, double interestRate, double riskScore) {
        this.loanId = loanId;
        this.customerId = customerId;
        this.amount = amount;
        this.termInYears = termInYears;
        this.interestRate = interestRate;
        this.riskScore = riskScore;
        this.insuranceType = "None";
        this.insuranceAmount = 0.0;
    }

    public int getLoanId() {
        return loanId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public double getAmount() {
        return amount;
    }

    public int getTermInYears() {
        return termInYears;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public double getRiskScore() {
        return riskScore;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public double getInsuranceAmount() {
        return insuranceAmount;
    }

    public void addInsurance(String insuranceType, double insuranceAmount) {
        this.insuranceType = insuranceType;
        this.insuranceAmount = insuranceAmount;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "loanId=" + loanId +
                ", customerId=" + customerId +
                ", amount=" + amount +
                ", termInYears=" + termInYears +
                ", interestRate=" + interestRate +
                ", riskScore=" + riskScore +
                ", insuranceType='" + insuranceType + '\'' +
                ", insuranceAmount=" + insuranceAmount +
                '}';
    }
}

// CustomerManager class
class CustomerManager {
    private List<Customer> customers = new ArrayList<>();

    public Customer createCustomer(int customerId, String name, int age, int creditScore, double annualIncome) {
        Customer customer = new Customer(customerId, name, age, creditScore, annualIncome);
        customers.add(customer);
        return customer;
    }

    public Customer getCustomerById(int customerId) {
        for (Customer customer : customers) {
            if (customer.getCustomerId() == customerId) {
                return customer;
            }
        }
        return null;
    }

    public void printAllCustomers() {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    public void updateCustomerIncome(int customerId, double newIncome) {
        Customer customer = getCustomerById(customerId);
        if (customer != null) {
            customer = new Customer(customer.getCustomerId(), customer.getName(), customer.getAge(), customer.getCreditScore(), newIncome);
        }
    }

    public void evaluateCustomerProfile(int creditScore, double annualIncome, int age) {
        if (creditScore >= 750 && annualIncome > 70000) {
            System.out.println("Customer is eligible for premium services.");
        } else if (creditScore >= 700 && annualIncome > 50000) {
            System.out.println("Customer is eligible for standard services.");
        } else if (creditScore >= 650) {
            System.out.println("Customer is eligible for basic services.");
        } else {
            System.out.println("Customer needs improvement in credit score.");
        }

        if (age < 25 && annualIncome < 30000) {
            System.out.println("Customer is considered high-risk due to age and low income.");
        } else if (age > 60 && creditScore < 600) {
            System.out.println("Customer is considered high-risk due to age and low credit score.");
        }
    }

    public boolean isEligibleForLoan(int creditScore, double annualIncome, int age, double requestedAmount) {
        if (creditScore >= 700 && requestedAmount < annualIncome * 5) {
            return true;
        } else if (creditScore >= 650 && requestedAmount < annualIncome * 4) {
            return true;
        } else if (creditScore >= 600 && requestedAmount < annualIncome * 3) {
            return true;
        } else if (creditScore < 600 && requestedAmount < annualIncome * 2) {
            return false;
        }

        if (age < 25 && requestedAmount > annualIncome * 2) {
            return false;
        } else if (age > 60 && creditScore < 600) {
            return false;
        }

        return false;
    }
}

// LoanManager class
class LoanManager {
    private int loanCounter = 1000;

    public Loan applyForLoan(int customerId, double amount, int termInYears, double interestRate, double riskScore) {
        if (amount <= 0 || termInYears <= 0 || interestRate <= 0) {
            throw new IllegalArgumentException("Loan amount, term, and interest rate must be positive.");
        }

        Loan loan = new Loan(loanCounter++, customerId, amount, termInYears, interestRate, riskScore);
        return loan;
    }

    public boolean approveLoan(int creditScore, double annualIncome, int age, double amount, int termInYears, double interestRate, double riskScore, double minCreditScore, double maxDebtToIncomeRatio) {
        if (creditScore < minCreditScore) {
            return false;
        }

        double debtToIncomeRatio = amount / annualIncome;
        if (debtToIncomeRatio > maxDebtToIncomeRatio) {
            return false;
        }

        if (termInYears > 30 || interestRate > 10.0) {
            return false;
        }

        if (riskScore > 50) {
            return false;
        }

        if (amount > 100000) {
            return false;
        }

        if (termInYears > 20 && age > 60) {
            return false;
        }

        if (creditScore < 600 && amount > 50000) {
            return false;
        }

        if (interestRate > 5.0 && termInYears > 25 && riskScore > 40) {
            return false;
        }

        return true;
    }

    public Loan modifyLoanTerm(int loanId, int customerId, double amount, double interestRate, double riskScore, int newTermInYears) {
        if (newTermInYears <= 0) {
            throw new IllegalArgumentException("Loan term must be positive.");
        }
        return new Loan(loanId, customerId, amount, newTermInYears, interestRate, riskScore);
    }

    public Loan changeInterestRate(int loanId, int customerId, double amount, int termInYears, double riskScore, double newInterestRate) {
        if (newInterestRate <= 0) {
            throw new IllegalArgumentException("Interest rate must be positive.");
        }
        return new Loan(loanId, customerId, amount, termInYears, newInterestRate, riskScore);
    }

    public Loan transferLoan(int loanId, int customerId, double amount, int termInYears, double interestRate, double riskScore, int newCustomerId) {
        return new Loan(loanId, newCustomerId, amount, termInYears, interestRate, riskScore);
    }
}

// RiskEvaluator class
class RiskEvaluator {
    public double evaluateRisk(int creditScore, double amount, int termInYears, int creditHistoryLength, int latePayments, int existingDebts, int bankruptcyHistory) {
        double riskScore = 0;

        if (creditScore < 600) {
            riskScore += 20;
        } else if (creditScore < 700) {
            riskScore += 10;
        }

        if (creditHistoryLength < 5) {
            riskScore += 15;
        }

        if (latePayments > 2) {
            riskScore += 20;
        }

        if (existingDebts > 50000) {
            riskScore += 25;
        }

        if (bankruptcyHistory > 0) {
            riskScore += 30;
        }

        if (amount > 300000) {
            riskScore += 15;
        } else if (amount > 100000) {
            riskScore += 10;
        }

        if (termInYears > 25) {
            riskScore += 10;
        }

        if (amount > 100000) {
            riskScore += 15;
        }

        if (amount > 50000) {
            riskScore += 20;
        }

        if (termInYears > 20 && creditScore < 600) {
            riskScore += 25;
        }

        return riskScore;
    }

    public boolean isHighRisk(double riskScore) {
        return riskScore > 50;
    }

    public String assessRiskLevel(double riskScore) {
        if (riskScore < 30) {
            return "Low Risk";
        } else if (riskScore < 50) {
            return "Moderate Risk";
        } else {
            return "High Risk";
        }
    }
}

// InterestCalculator class
class InterestCalculator {
    public double calculateInterestRate(int creditScore, int loanTerm, double loanAmount, double baseRate, double riskScore) {
        double interestRate = baseRate;

        if (creditScore < 600) {
            interestRate += 2.0;
        } else if (creditScore < 700) {
            interestRate += 1.0;
        }

        if (loanTerm > 20) {
            interestRate += 0.5;
        }

        if (loanAmount > 500000) {
            interestRate += 0.75;
        } else if (loanAmount > 200000) {
            interestRate += 0.5;
        }

        if (riskScore > 40) {
            interestRate += 1.5;
        }

        if (loanTerm < 10) {
            interestRate -= 0.25;
        }

        if (loanAmount > 100000) {
            interestRate += 0.5;
        }

        if (creditScore < 650 && loanAmount > 150000) {
            interestRate += 0.75;
        }

        if (loanTerm > 25 && loanAmount > 250000 && riskScore > 50) {
            interestRate += 1.25;
        }

        return interestRate;
    }

    public double adjustInterestForMarket(double interestRate, double marketConditionFactor) {
        return interestRate * marketConditionFactor;
    }

    public double calculateTotalInterest(double loanAmount, double interestRate, int loanTerm) {
        return loanAmount * (interestRate / 100) * loanTerm;
    }
}

// RepaymentSchedule class
class RepaymentSchedule {
    int paymentNumber;
    double principal;
    double interest;
    double totalPayment;
    double remainingBalance;

    public RepaymentSchedule(int paymentNumber, double principal, double interest, double totalPayment, double remainingBalance) {
        this.paymentNumber = paymentNumber;
        this.principal = principal;
        this.interest = interest;
        this.totalPayment = totalPayment;
        this.remainingBalance = remainingBalance;
    }

    @Override
    public String toString() {
        return "Payment #" + paymentNumber +
                ": Principal=" + principal +
                ", Interest=" + interest +
                ", Total Payment=" + totalPayment +
                ", Remaining Balance=" + remainingBalance;
    }
}

// RepaymentScheduleGenerator class
class RepaymentScheduleGenerator {
    public List<RepaymentSchedule> generateSchedule(double loanAmount, double interestRate, int termInYears, int paymentsPerYear) {
        List<RepaymentSchedule> schedule = new ArrayList<>();

        double monthlyInterestRate = interestRate / 100 / paymentsPerYear;
        int totalPayments = termInYears * paymentsPerYear;
        double monthlyPayment = loanAmount * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, totalPayments)) /
                (Math.pow(1 + monthlyInterestRate, totalPayments) - 1);

        double remainingBalance = loanAmount;

        for (int i = 1; i <= totalPayments; i++) {
            double interest = remainingBalance * monthlyInterestRate;
            double principal = monthlyPayment - interest;
            remainingBalance -= principal;

            schedule.add(new RepaymentSchedule(i, principal, interest, monthlyPayment, remainingBalance));
        }

        return schedule;
    }

    public List<RepaymentSchedule> recalculateSchedule(List<RepaymentSchedule> existingSchedule, double newInterestRate, double remainingLoanAmount, int remainingTerm) {
        List<RepaymentSchedule> newSchedule = new ArrayList<>();
        double monthlyInterestRate = newInterestRate / 100 / 12;
        int totalPayments = remainingTerm * 12;
        double monthlyPayment = remainingLoanAmount * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, totalPayments)) /
                (Math.pow(1 + monthlyInterestRate, totalPayments) - 1);

        for (int i = 1; i <= totalPayments; i++) {
            double interest = remainingLoanAmount * monthlyInterestRate;
            double principal = monthlyPayment - interest;
            remainingLoanAmount -= principal;

            newSchedule.add(new RepaymentSchedule(i, principal, interest, monthlyPayment, remainingLoanAmount));
        }

        return newSchedule;
    }

    public List<RepaymentSchedule> applyExtraPayment(List<RepaymentSchedule> schedule, double extraPayment) {
        List<RepaymentSchedule> newSchedule = new ArrayList<>();

        for (RepaymentSchedule rs : schedule) {
            double newPrincipal = rs.principal + extraPayment;
            double newRemainingBalance = rs.remainingBalance - extraPayment;

            newSchedule.add(new RepaymentSchedule(rs.paymentNumber, newPrincipal, rs.interest, rs.totalPayment, newRemainingBalance));
        }

        return newSchedule;
    }

    public boolean validateSchedule(List<RepaymentSchedule> schedule) {
        for (RepaymentSchedule rs : schedule) {
            if (rs.principal <= 0 || rs.interest < 0 || rs.totalPayment <= 0 || rs.remainingBalance < 0) {
                return false;
            }
        }
        return true;
    }
}

// LoanPortfolio class
class LoanPortfolio {
    private List<Loan> loans = new ArrayList<>();

    public void addLoan(Loan loan) {
        loans.add(loan);
    }

    public double calculateTotalDebt() {
        double totalDebt = 0;
        for (Loan loan : loans) {
            totalDebt += loan.getAmount();
        }
        return totalDebt;
    }

    public double calculateAverageInterestRate() {
        double totalInterest = 0;
        for (Loan loan : loans) {
            totalInterest += loan.getInterestRate();
        }
        return totalInterest / loans.size();
    }

    public double evaluatePortfolioRisk() {
        double riskScore = 0;
        for (Loan loan : loans) {
            riskScore += loan.getRiskScore();
        }
        return riskScore / loans.size();
    }

    public void removeLoan(Loan loan) {
        loans.remove(loan);
    }

    public Loan findHighestRiskLoan() {
        Loan highestRiskLoan = null;
        double maxRiskScore = 0;
        for (Loan loan : loans) {
            if (loan.getRiskScore() > maxRiskScore) {
                maxRiskScore = loan.getRiskScore();
                highestRiskLoan = loan;
            }
        }
        return highestRiskLoan;
    }

    public Loan findLowestInterestLoan() {
        Loan lowestInterestLoan = null;
        double minInterestRate = Double.MAX_VALUE;
        for (Loan loan : loans) {
            if (loan.getInterestRate() < minInterestRate) {
                minInterestRate = loan.getInterestRate();
                lowestInterestLoan = loan;
            }
        }
        return lowestInterestLoan;
    }

    public void rebalancePortfolio() {
        for (Loan loan : loans) {
            if (loan.getRiskScore() > 50 && loan.getInterestRate() < 5.0) {
                loan.addInsurance("Risk Insurance", loan.getAmount() * 0.05);
            } else if (loan.getRiskScore() < 30 && loan.getInterestRate() > 7.0) {
                loan.addInsurance("Premium Insurance", loan.getAmount() * 0.03);
            }
        }
    }
}

// PaymentGateway class
class PaymentGateway {
    public boolean processPayment(int loanId, double amount) {
        if (amount <= 0) {
            return false;
        }
        // Simulate payment processing
        System.out.println("Processing payment of " + amount + " for loan ID: " + loanId);
        return true;
    }

    public boolean refundPayment(int loanId, double amount) {
        if (amount <= 0) {
            return false;
        }
        // Simulate refund processing
        System.out.println("Refunding payment of " + amount + " for loan ID: " + loanId);
        return true;
    }

    public boolean processBatchPayments(List<PaymentTransaction> transactions) {
        for (PaymentTransaction transaction : transactions) {
            if (!processPayment(transaction.getLoanId(), transaction.getAmount())) {
                return false;
            }
        }
        return true;
    }

    public boolean processBatchRefunds(List<PaymentTransaction> transactions) {
        for (PaymentTransaction transaction : transactions) {
            if (!refundPayment(transaction.getLoanId(), transaction.getAmount())) {
                return false;
            }
        }
        return true;
    }

    public boolean validatePaymentAmount(double amount) {
        if (amount <= 0) {
            return false;
        } else if (amount > 10000) {
            return false;
        }
        return true;
    }

    public void auditPayments(List<PaymentTransaction> transactions) {
        for (PaymentTransaction transaction : transactions) {
            if (!validatePaymentAmount(transaction.getAmount())) {
                System.out.println("Invalid payment amount detected for loan ID: " + transaction.getLoanId());
            }
        }
    }
}

// PaymentTransaction class
class PaymentTransaction {
    private int loanId;
    private double amount;

    public PaymentTransaction(int loanId, double amount) {
        this.loanId = loanId;
        this.amount = amount;
    }

    public int getLoanId() {
        return loanId;
    }

    public double getAmount() {
        return amount;
    }
}

// InsuranceManager class
class InsuranceManager {
    public void addInsuranceToLoan(Loan loan, String insuranceType, double insuranceAmount) {
        if (insuranceAmount <= 0) {
            throw new IllegalArgumentException("Insurance amount must be positive.");
        }
        loan.addInsurance(insuranceType, insuranceAmount);
    }

    public void updateInsuranceAmount(Loan loan, double newInsuranceAmount) {
        if (newInsuranceAmount <= 0) {
            throw new IllegalArgumentException("Insurance amount must be positive.");
        }
        loan.addInsurance(loan.getInsuranceType(), newInsuranceAmount);
    }

    public void removeInsuranceFromLoan(Loan loan) {
        loan.addInsurance("None", 0.0);
    }

    public void auditInsurance(Loan loan) {
        if (loan.getInsuranceAmount() <= 0 && loan.getAmount() > 100000) {
            System.out.println("Loan ID: " + loan.getLoanId() + " requires insurance due to high loan amount.");
        }

        if (loan.getInsuranceAmount() > 10000) {
            System.out.println("Loan ID: " + loan.getLoanId() + " has high insurance coverage.");
        }
    }

    public boolean isInsuranceRequired(Loan loan) {
        if (loan.getAmount() > 100000 && loan.getRiskScore() > 50) {
            return true;
        } else if (loan.getTermInYears() > 20 && loan.getInterestRate() > 6.0) {
            return true;
        }
        return false;
    }
}

// ComplexChecker class
class ComplexChecker {
    public void complexCheck(int a, int b, int c, int d, int e) {
        if (a > b && b > c && c > d && d > e) {
            System.out.println("Numbers are in descending order.");
        } else if (a < b && b < c && c < d && d < e) {
            System.out.println("Numbers are in ascending order.");
        } else if (a == b && b == c && c == d && d == e) {
            System.out.println("All numbers are equal.");
        } else if (a != b && b != c && c != d && d != e) {
            System.out.println("All numbers are different.");
        }

        if ((a + b + c + d + e) % 2 == 0) {
            System.out.println("The sum of the numbers is even.");
        } else {
            System.out.println("The sum of the numbers is odd.");
        }

        if (a > 0 && b > 0 && c > 0 && d > 0 && e > 0) {
            System.out.println("All numbers are positive.");
        } else if (a < 0 && b < 0 && c < 0 && d < 0 && e < 0) {
            System.out.println("All numbers are negative.");
        }

        if (a * b * c * d * e > 1000) {
            System.out.println("The product of the numbers is greater than 1000.");
        } else {
            System.out.println("The product of the numbers is less than or equal to 1000.");
        }

        if (a % 2 == 0 || b % 2 == 0 || c % 2 == 0 || d % 2 == 0 || e % 2 == 0) {
            System.out.println("At least one number is even.");
        }

        if (a % 2 != 0 && b % 2 != 0 && c % 2 != 0 && d % 2 != 0 && e % 2 != 0) {
            System.out.println("All numbers are odd.");
        }
    }
}

// TestLoanManagementSystem class
class TestLoanManagementSystem {
    public static void main(String[] args) {
        testCustomerManager();
        testLoanManager();
        testRiskEvaluator();
        testInterestCalculator();
        testRepaymentScheduleGenerator();
        testLoanPortfolio();
        testPaymentGateway();
        testInsuranceManager();
        testComplexChecker(); // Testing the ComplexChecker functionality
    }

    private static void testCustomerManager() {
        CustomerManager customerManager = new CustomerManager();
        Customer customer = customerManager.createCustomer(105, "Alice Brown", 40, 720, 80000);
        assert customer.getName().equals("Alice Brown");
        assert customer.getCreditScore() == 720;
        customerManager.updateCustomerIncome(105, 85000);
        assert customer.getAnnualIncome() == 85000;
        customerManager.evaluateCustomerProfile(customer.getCreditScore(), customer.getAnnualIncome(), customer.getAge());
        assert customerManager.isEligibleForLoan(customer.getCreditScore(), customer.getAnnualIncome(), customer.getAge(), 300000);
        System.out.println("CustomerManager tests passed.");
    }

    private static void testLoanManager() {
        CustomerManager customerManager = new CustomerManager();
        LoanManager loanManager = new LoanManager();
        Customer customer = customerManager.createCustomer(106, "Bob Green", 30, 680, 50000);
        Loan loan = loanManager.applyForLoan(customer.getCustomerId(), 250000, 20, 4.5, 35);
        assert loan.getAmount() == 250000;
        assert loan.getTermInYears() == 20;
        loan = loanManager.modifyLoanTerm(loan.getLoanId(), loan.getCustomerId(), loan.getAmount(), loan.getInterestRate(), loan.getRiskScore(), 25);
        assert loan.getTermInYears() == 25;
        loan = loanManager.changeInterestRate(loan.getLoanId(), loan.getCustomerId(), loan.getAmount(), loan.getTermInYears(), loan.getRiskScore(), 5.0);
        assert loan.getInterestRate() == 5.0;
        assert loanManager.approveLoan(customer.getCreditScore(), customer.getAnnualIncome(), customer.getAge(), loan.getAmount(), loan.getTermInYears(), loan.getInterestRate(), loan.getRiskScore(), 650, 5.0);
        loan = loanManager.transferLoan(loan.getLoanId(), loan.getCustomerId(), loan.getAmount(), loan.getTermInYears(), loan.getInterestRate(), loan.getRiskScore(), 107);
        System.out.println("LoanManager tests passed.");
    }

    private static void testRiskEvaluator() {
        RiskEvaluator riskEvaluator = new RiskEvaluator();
        double riskScore = riskEvaluator.evaluateRisk(700, 300000, 25, 20, 1, 40000, 0);
        assert riskScore > 0;
        String riskLevel = riskEvaluator.assessRiskLevel(riskScore);
        assert riskLevel.equals("Moderate Risk") || riskLevel.equals("High Risk");
        assert riskEvaluator.isHighRisk(riskScore);
        System.out.println("RiskEvaluator tests passed.");
    }

    private static void testInterestCalculator() {
        InterestCalculator interestCalculator = new InterestCalculator();
        double interestRate = interestCalculator.calculateInterestRate(700, 25, 300000, 3.5, 40);
        assert interestRate > 4.0;
        double adjustedRate = interestCalculator.adjustInterestForMarket(interestRate, 1.2);
        assert adjustedRate > interestRate;
        double totalInterest = interestCalculator.calculateTotalInterest(300000, adjustedRate, 25);
        assert totalInterest > 0;
        System.out.println("InterestCalculator tests passed.");
    }

    private static void testRepaymentScheduleGenerator() {
        RepaymentScheduleGenerator generator = new RepaymentScheduleGenerator();
        List<RepaymentSchedule> schedule = generator.generateSchedule(300000, 4.0, 25, 12);
        assert schedule.size() == 25 * 12;
        List<RepaymentSchedule> newSchedule = generator.recalculateSchedule(schedule, 3.5, 250000, 20);
        assert newSchedule.size() == 20 * 12;
        assert generator.validateSchedule(newSchedule);
        List<RepaymentSchedule> extraPaymentSchedule = generator.applyExtraPayment(newSchedule, 5000);
        assert extraPaymentSchedule.size() == newSchedule.size();
        System.out.println("RepaymentScheduleGenerator tests passed.");
    }

    private static void testLoanPortfolio() {
        LoanPortfolio portfolio = new LoanPortfolio();
        portfolio.addLoan(new Loan(1010, 0, 150000, 15, 3.5, 25));
        portfolio.addLoan(new Loan(1011, 0, 200000, 20, 4.0, 30));
        double totalDebt = portfolio.calculateTotalDebt();
        assert totalDebt == 350000;
        Loan highestRiskLoan = portfolio.findHighestRiskLoan();
        assert highestRiskLoan != null;
        Loan lowestInterestLoan = portfolio.findLowestInterestLoan();
        assert lowestInterestLoan != null;
        portfolio.rebalancePortfolio();
        portfolio.removeLoan(highestRiskLoan);
        assert portfolio.calculateTotalDebt() < 350000;
        System.out.println("LoanPortfolio tests passed.");
    }

    private static void testPaymentGateway() {
        PaymentGateway gateway = new PaymentGateway();
        assert gateway.processPayment(1012, 1000);
        assert gateway.refundPayment(1012, 500);
        List<PaymentTransaction> transactions = new ArrayList<>();
        transactions.add(new PaymentTransaction(1013, 1500));
        transactions.add(new PaymentTransaction(1014, 2000));
        assert gateway.processBatchPayments(transactions);
        assert gateway.processBatchRefunds(transactions);
        gateway.auditPayments(transactions);
        System.out.println("PaymentGateway tests passed.");
    }

    private static void testInsuranceManager() {
        CustomerManager customerManager = new CustomerManager();
        LoanManager loanManager = new LoanManager();
        InsuranceManager insuranceManager = new InsuranceManager();
        Customer customer = customerManager.createCustomer(108, "Daisy Yellow", 38, 740, 70000);
        Loan loan = loanManager.applyForLoan(customer.getCustomerId(), 180000, 20, 4.5, 32);
        insuranceManager.addInsuranceToLoan(loan, "Life Insurance", 5000);
        assert loan.getInsuranceType().equals("Life Insurance");
        assert loan.getInsuranceAmount() == 5000;
        insuranceManager.updateInsuranceAmount(loan, 6000);
        assert loan.getInsuranceAmount() == 6000;
        insuranceManager.removeInsuranceFromLoan(loan);
        assert loan.getInsuranceType().equals("None");
        assert loan.getInsuranceAmount() == 0;
        insuranceManager.auditInsurance(loan);
        assert insuranceManager.isInsuranceRequired(loan);
        System.out.println("InsuranceManager tests passed.");
    }

    private static void testComplexChecker() {
        ComplexChecker checker = new ComplexChecker();
        checker.complexCheck(5, 4, 3, 2, 1); // Descending order
        checker.complexCheck(1, 2, 3, 4, 5); // Ascending order
        checker.complexCheck(1, 1, 1, 1, 1); // All equal
        checker.complexCheck(1, 2, 3, 4, 6); // All different
        checker.complexCheck(-5, -4, -3, -2, -1); // Negative descending
        checker.complexCheck(-1, 0, 1, 2, 3); // Mixed positive and negative
        checker.complexCheck(0, 0, 0, 0, 0); // All zeroes
        checker.complexCheck(1000, 1000, 1000, 1000, 1000); // Large equal numbers
        checker.complexCheck(1, 3, 5, 7, 9); // All odd numbers
        checker.complexCheck(2, 4, 6, 8, 10); // All even numbers
        System.out.println("ComplexChecker tests passed.");
    }
}