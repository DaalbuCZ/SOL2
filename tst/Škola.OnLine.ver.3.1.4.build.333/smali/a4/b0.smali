.class public final synthetic La4/b0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ly4/d;


# instance fields
.field public final synthetic a:La4/d;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/util/concurrent/ScheduledFuture;


# direct methods
.method public synthetic constructor <init>(La4/d;Ljava/lang/String;Ljava/util/concurrent/ScheduledFuture;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La4/b0;->a:La4/d;

    iput-object p2, p0, La4/b0;->b:Ljava/lang/String;

    iput-object p3, p0, La4/b0;->c:Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method


# virtual methods
.method public final a(Ly4/i;)V
    .locals 3

    iget-object v0, p0, La4/b0;->a:La4/d;

    iget-object v1, p0, La4/b0;->b:Ljava/lang/String;

    iget-object v2, p0, La4/b0;->c:Ljava/util/concurrent/ScheduledFuture;

    invoke-virtual {v0, v1, v2, p1}, La4/d;->e(Ljava/lang/String;Ljava/util/concurrent/ScheduledFuture;Ly4/i;)V

    return-void
.end method
