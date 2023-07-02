.class public final Lz4/g;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private a:Lz4/n;


# direct methods
.method synthetic constructor <init>(Lz4/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lz4/e;
    .locals 3

    iget-object v0, p0, Lz4/g;->a:Lz4/n;

    if-eqz v0, :cond_0

    new-instance v1, Lz4/e0;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lz4/e0;-><init>(Lz4/n;Lz4/d0;)V

    return-object v1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-class v1, Lz4/n;

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, " must be set"

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b(Lz4/n;)Lz4/g;
    .locals 0

    iput-object p1, p0, Lz4/g;->a:Lz4/n;

    return-object p0
.end method
