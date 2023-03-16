.class public final synthetic Lu1/r;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lu1/s$a;

.field public final synthetic o:Z


# direct methods
.method public synthetic constructor <init>(Lu1/s$a;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu1/r;->n:Lu1/s$a;

    iput-boolean p2, p0, Lu1/r;->o:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lu1/r;->n:Lu1/s$a;

    iget-boolean v1, p0, Lu1/r;->o:Z

    invoke-static {v0, v1}, Lu1/s$a;->a(Lu1/s$a;Z)V

    return-void
.end method
