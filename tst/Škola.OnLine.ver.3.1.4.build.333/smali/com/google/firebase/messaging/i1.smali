.class public final synthetic Lcom/google/firebase/messaging/i1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ly4/d;


# instance fields
.field public final synthetic a:Ljava/util/concurrent/ScheduledFuture;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/ScheduledFuture;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/messaging/i1;->a:Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method


# virtual methods
.method public final a(Ly4/i;)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/messaging/i1;->a:Ljava/util/concurrent/ScheduledFuture;

    invoke-static {v0, p1}, Lcom/google/firebase/messaging/j1$a;->b(Ljava/util/concurrent/ScheduledFuture;Ly4/i;)V

    return-void
.end method
