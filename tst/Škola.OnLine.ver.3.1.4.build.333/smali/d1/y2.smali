.class public Ld1/y2;
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
.field private final a:Ld1/s2;

.field private final b:Ld1/z1;


# direct methods
.method public constructor <init>(Ld1/s2;Ld1/z1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld1/y2;->a:Ld1/s2;

    iput-object p2, p0, Ld1/y2;->b:Ld1/z1;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Boolean;
    .locals 2

    :try_start_0
    iget-object v0, p0, Ld1/y2;->a:Ld1/s2;

    iget-object v1, p0, Ld1/y2;->b:Ld1/z1;

    invoke-interface {v0, v1}, Ld1/s2;->n(Ld1/z1;)V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catch Ld1/a1; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Bugfender-SDK"

    invoke-static {v1, v0}, Ld1/i0;->d(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ld1/y2;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
