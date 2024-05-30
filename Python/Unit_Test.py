# 1. Write a  Python unit test program to check if a given number is prime or not.

import unittest

""" class TestSum(unittest.TestCase):
    def test_prime(self):
        self.assertTrue(is_prime(2))
        self.assertFalse(is_prime(9))
        self.assertTrue(is_prime(13))
        self.assertFalse(is_prime(15))
        self.assertTrue(is_prime(17))
        self.assertFalse(is_prime(21))



def is_prime(n):
    is_Prime=True
    for i in range(2,(n//2)+1):
        if n%i==0:
            is_Prime=False
            break
    if is_Prime==True:
        return True
    return False
  
if __name__ == '__main__':
    unittest.main() """
    
# 2. Write a  Python unit test program to check if a list is sorted in ascending order.

""" class TestAsc(unittest.TestCase):
    def test_lst_asc(self):
        self.assertTrue(asc([1,2,3,4,5]))
        self.assertFalse(asc([1,2,4,3,5]))
        self.assertTrue(asc([1,2,4,4,5]))
        self.assertTrue(asc([1,2,3,4,4]))
        self.assertFalse(asc([1,2,3,4,3]))
        
def asc(lst):
    for i in range(len(lst)-1):
        if lst[i]>lst[i+1]:
            return False
    return True

if __name__=='__main__':
    unittest.main()
      """   
    