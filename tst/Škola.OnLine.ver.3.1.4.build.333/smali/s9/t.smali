.class public Ls9/t;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ls9/i;)Lw9/d;
    .locals 0

    return-object p1
.end method

.method public b(Ljava/lang/Class;)Lw9/b;
    .locals 1

    new-instance v0, Ls9/e;

    invoke-direct {v0, p1}, Ls9/e;-><init>(Ljava/lang/Class;)V

    return-object v0
.end method

.method public c(Ljava/lang/Class;Ljava/lang/String;)Lw9/c;
    .locals 1

    new-instance v0, Ls9/m;

    invoke-direct {v0, p1, p2}, Ls9/m;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    return-object v0
.end method

.method public d(Ls9/n;)Lw9/e;
    .locals 0

    return-object p1
.end method

.method public e(Ls9/h;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getGenericInterfaces()[Ljava/lang/reflect/Type;

    move-result-object p1

    const/4 v0, 0x0

    aget-object p1, p1, v0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "kotlin.jvm.functions."

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x15

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method public f(Ls9/l;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1}, Ls9/t;->e(Ls9/h;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
