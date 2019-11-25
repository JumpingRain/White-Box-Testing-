# junit + jacoco  白盒测试训练

## 实验结果

### 总体结果
![image](https://github.com/JumpingRain/White-Box-Testing-/blob/master/IMG/1.png)
![image](https://github.com/JumpingRain/White-Box-Testing-/blob/master/IMG/2.png)

### 具体代码
![image](https://github.com/JumpingRain/White-Box-Testing-/blob/master/IMG/3.png)
![image](https://github.com/JumpingRain/White-Box-Testing-/blob/master/IMG/4.png)
![image](https://github.com/JumpingRain/White-Box-Testing-/blob/master/IMG/5.png)

## 结果分析

从实验结果可以看到**语句执行率**到达了**100%**，**分支执行率**达到了**98%**。

其中没有被覆盖的分支是`Method4`中的`if((a == b) || ((c == d) && (bug(a))))`的分支，只是因为根据代码可以得出，不覆盖的原因是若是在此得到`x=0`，会使得后面出现除数为零的情况，所以没有包含。

