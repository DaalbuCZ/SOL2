.class final Lr9/j2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb9/g$b;
.implements Lb9/g$c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lb9/g$b;",
        "Lb9/g$c<",
        "Lr9/j2;",
        ">;"
    }
.end annotation


# static fields
.field public static final n:Lr9/j2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lr9/j2;

    invoke-direct {v0}, Lr9/j2;-><init>()V

    sput-object v0, Lr9/j2;->n:Lr9/j2;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public B(Lb9/g$c;)Lb9/g;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb9/g$c<",
            "*>;)",
            "Lb9/g;"
        }
    .end annotation

    invoke-static {p0, p1}, Lb9/g$b$a;->c(Lb9/g$b;Lb9/g$c;)Lb9/g;

    move-result-object p1

    return-object p1
.end method

.method public S(Ljava/lang/Object;Lj9/p;)Ljava/lang/Object;
    .locals 0
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

    invoke-static {p0, p1, p2}, Lb9/g$b$a;->a(Lb9/g$b;Ljava/lang/Object;Lj9/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public c(Lb9/g$c;)Lb9/g$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lb9/g$b;",
            ">(",
            "Lb9/g$c<",
            "TE;>;)TE;"
        }
    .end annotation

    invoke-static {p0, p1}, Lb9/g$b$a;->b(Lb9/g$b;Lb9/g$c;)Lb9/g$b;

    move-result-object p1

    return-object p1
.end method

.method public getKey()Lb9/g$c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lb9/g$c<",
            "*>;"
        }
    .end annotation

    return-object p0
.end method

.method public j(Lb9/g;)Lb9/g;
    .locals 0

    invoke-static {p0, p1}, Lb9/g$b$a;->d(Lb9/g$b;Lb9/g;)Lb9/g;

    move-result-object p1

    return-object p1
.end method
