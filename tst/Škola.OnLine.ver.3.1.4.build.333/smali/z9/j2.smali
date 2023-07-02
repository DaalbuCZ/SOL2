.class final Lz9/j2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lj9/g$b;
.implements Lj9/g$c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lj9/g$b;",
        "Lj9/g$c<",
        "Lz9/j2;",
        ">;"
    }
.end annotation


# static fields
.field public static final n:Lz9/j2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lz9/j2;

    invoke-direct {v0}, Lz9/j2;-><init>()V

    sput-object v0, Lz9/j2;->n:Lz9/j2;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public E(Lj9/g;)Lj9/g;
    .locals 0

    invoke-static {p0, p1}, Lj9/g$b$a;->d(Lj9/g$b;Lj9/g;)Lj9/g;

    move-result-object p1

    return-object p1
.end method

.method public Q(Lj9/g$c;)Lj9/g;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj9/g$c<",
            "*>;)",
            "Lj9/g;"
        }
    .end annotation

    invoke-static {p0, p1}, Lj9/g$b$a;->c(Lj9/g$b;Lj9/g$c;)Lj9/g;

    move-result-object p1

    return-object p1
.end method

.method public c(Lj9/g$c;)Lj9/g$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lj9/g$b;",
            ">(",
            "Lj9/g$c<",
            "TE;>;)TE;"
        }
    .end annotation

    invoke-static {p0, p1}, Lj9/g$b$a;->b(Lj9/g$b;Lj9/g$c;)Lj9/g$b;

    move-result-object p1

    return-object p1
.end method

.method public getKey()Lj9/g$c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lj9/g$c<",
            "*>;"
        }
    .end annotation

    return-object p0
.end method

.method public v(Ljava/lang/Object;Lr9/p;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(TR;",
            "Lr9/p<",
            "-TR;-",
            "Lj9/g$b;",
            "+TR;>;)TR;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lj9/g$b$a;->a(Lj9/g$b;Ljava/lang/Object;Lr9/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
