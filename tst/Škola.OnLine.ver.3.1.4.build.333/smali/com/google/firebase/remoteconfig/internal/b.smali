.class public final synthetic Lcom/google/firebase/remoteconfig/internal/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/google/firebase/remoteconfig/internal/n;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/remoteconfig/internal/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/remoteconfig/internal/b;->a:Lcom/google/firebase/remoteconfig/internal/n;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/remoteconfig/internal/b;->a:Lcom/google/firebase/remoteconfig/internal/n;

    invoke-virtual {v0}, Lcom/google/firebase/remoteconfig/internal/n;->d()Lcom/google/firebase/remoteconfig/internal/e;

    move-result-object v0

    return-object v0
.end method
