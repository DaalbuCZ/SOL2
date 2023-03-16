.class public final synthetic Lt7/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lt7/d;

.field public final synthetic o:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lt7/d;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt7/c;->n:Lt7/d;

    iput-object p2, p0, Lt7/c;->o:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lt7/c;->n:Lt7/d;

    iget-object v1, p0, Lt7/c;->o:Ljava/lang/String;

    invoke-static {v0, v1}, Lt7/d;->d(Lt7/d;Ljava/lang/String;)V

    return-void
.end method
