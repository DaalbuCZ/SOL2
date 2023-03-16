.class public abstract Lb9/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb9/g$b;


# instance fields
.field private final n:Lb9/g$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb9/g$c<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lb9/g$c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb9/g$c<",
            "*>;)V"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lk9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb9/a;->n:Lb9/g$c;

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
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lb9/g$c<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lb9/a;->n:Lb9/g$c;

    return-object v0
.end method

.method public j(Lb9/g;)Lb9/g;
    .locals 0

    invoke-static {p0, p1}, Lb9/g$b$a;->d(Lb9/g$b;Lb9/g;)Lb9/g;

    move-result-object p1

    return-object p1
.end method
