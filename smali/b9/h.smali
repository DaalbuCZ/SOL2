.class public final Lb9/h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb9/g;
.implements Ljava/io/Serializable;


# static fields
.field public static final n:Lb9/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb9/h;

    invoke-direct {v0}, Lb9/h;-><init>()V

    sput-object v0, Lb9/h;->n:Lb9/h;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public B(Lb9/g$c;)Lb9/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb9/g$c<",
            "*>;)",
            "Lb9/g;"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lk9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public S(Ljava/lang/Object;Lj9/p;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(TR;",
            "Lj9/p<",
            "-TR;-",
            "Lb9/g$b;",
            "+TR;>;)TR;"
        }
    .end annotation

    const-string v0, "operation"

    invoke-static {p2, v0}, Lk9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public c(Lb9/g$c;)Lb9/g$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lb9/g$b;",
            ">(",
            "Lb9/g$c<",
            "TE;>;)TE;"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lk9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public hashCode()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public j(Lb9/g;)Lb9/g;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lk9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "EmptyCoroutineContext"

    return-object v0
.end method
