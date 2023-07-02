.class public Lx7/d;
.super Lx7/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx7/d$a;
    }
.end annotation


# instance fields
.field public final a:Lx7/d$a;

.field final b:Lt8/j;


# direct methods
.method public constructor <init>(Lt8/j;Lt8/k$d;)V
    .locals 0

    invoke-direct {p0}, Lx7/a;-><init>()V

    iput-object p1, p0, Lx7/d;->b:Lt8/j;

    new-instance p1, Lx7/d$a;

    invoke-direct {p1, p0, p2}, Lx7/d$a;-><init>(Lx7/d;Lt8/k$d;)V

    iput-object p1, p0, Lx7/d;->a:Lx7/d$a;

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    iget-object v0, p0, Lx7/d;->b:Lt8/j;

    invoke-virtual {v0, p1}, Lt8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lx7/d;->b:Lt8/j;

    iget-object v0, v0, Lt8/j;->a:Ljava/lang/String;

    return-object v0
.end method

.method public j(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lx7/d;->b:Lt8/j;

    invoke-virtual {v0, p1}, Lt8/j;->c(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public o()Lx7/f;
    .locals 1

    iget-object v0, p0, Lx7/d;->a:Lx7/d$a;

    return-object v0
.end method
