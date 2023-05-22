import re
N, M = map(int, input().split())
S = input()

mo = ['A', 'E', 'I', 'O', 'U']  # 모음
index_A = []  # A인덱스 모을거
for A in re.finditer('A', S):
    index_A.append(A.start())


def find_A(S):  # S의 맨 뒤 자음+뒤 두번째 세번째가 A면 YES 출력+S 그대로 뱉고 아니면 NO 출력
    if S[-1] not in mo and S[-2] == 'A' and S[-3] == 'A':
        print("YES\n"+S)
    else:
        print("NO")


if len(index_A) < 2:  # A 두개도 없으면 NO
    print("NO")
elif N == M:  # 만들어야 되는 수와 들어온 수가 같으면 find_A
    find_A(S)
else:
    while S[-1] in mo:  # 뒤에서부터 모음 자르기 -> 맨뒤 자음
        S = S[:-1]

    if len(S) < M:  # 자르고 나서 짧아지면 NO
        print("NO")
    elif len(S) == M:  # 만들어야 되는 수와 자른 수가 같으면 find_A
        find_A(S)
    else:
        # 모음 자를 때 A도 잘릴 가능성 있기 때문에 index_A의 원소중 S길이보다 큰거 없애기
        while len(S) < index_A[-1]:
            index_A.pop()
        # 처음 ~ 뒤에서 두 번째 A까지 자르기+ 제일 뒤의 A에서 끝까지 자르기 -> 중간만 없어짐!!
        S = S[: index_A[-2]+1]+S[index_A[-1]:]
        if len(S) < M:  # 자르고 나서 짧아지면 NO
            print("NO")
        elif len(S) == M:  # 만들어야 되는 수와 자른 수가 같으면 YES
            print("YES\n"+S)
        else:
            while len(S) != M:
                S = S[1:]
            print("YES\n"+S)
