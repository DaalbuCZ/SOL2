.class public final synthetic Ld7/n;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lk5/h;


# instance fields
.field public final synthetic a:Lk5/f0;


# direct methods
.method public synthetic constructor <init>(Lk5/f0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld7/n;->a:Lk5/f0;

    return-void
.end method


# virtual methods
.method public final a(Lk5/e;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ld7/n;->a:Lk5/f0;

    invoke-static {v0, p1}, Lcom/google/firebase/remoteconfig/RemoteConfigRegistrar;->a(Lk5/f0;Lk5/e;)Lcom/google/firebase/remoteconfig/c;

    move-result-object p1

    return-object p1
.end method
