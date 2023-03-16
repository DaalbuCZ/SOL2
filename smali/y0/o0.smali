.class public Ly0/o0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Ly0/j3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly0/j3<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ly0/f2;

.field private final c:Ly0/c3;

.field private d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ly0/j3;Ly0/f2;Ly0/c3;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly0/j3<",
            "Ljava/lang/String;",
            ">;",
            "Ly0/f2;",
            "Ly0/c3;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly0/o0;->a:Ly0/j3;

    iput-object p2, p0, Ly0/o0;->b:Ly0/f2;

    iput-object p3, p0, Ly0/o0;->c:Ly0/c3;

    iput-object p4, p0, Ly0/o0;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Boolean;
    .locals 6

    :try_start_0
    iget-object v0, p0, Ly0/o0;->b:Ly0/f2;

    iget-object v1, p0, Ly0/o0;->c:Ly0/c3;

    invoke-virtual {v1}, Ly0/c3;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Ly0/o0;->c:Ly0/c3;

    invoke-virtual {v2}, Ly0/c3;->l()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ly0/q;

    iget-object v4, p0, Ly0/o0;->d:Ljava/lang/String;

    const/4 v5, 0x0

    invoke-direct {v3, v4, v5}, Ly0/q;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v2, v3}, Ly0/f2;->c(Ljava/lang/String;Ljava/lang/String;Ly0/q;)V

    iget-object v0, p0, Ly0/o0;->a:Ly0/j3;

    iget-object v1, p0, Ly0/o0;->d:Ljava/lang/String;

    invoke-interface {v0, v1}, Ly0/j3;->b(Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0
    :try_end_0
    .catch Ly0/v0; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ly0/o0;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
