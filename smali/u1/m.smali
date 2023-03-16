.class public final synthetic Lu1/m;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lu1/s$a;

.field public final synthetic o:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lu1/s$a;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu1/m;->n:Lu1/s$a;

    iput-object p2, p0, Lu1/m;->o:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lu1/m;->n:Lu1/s$a;

    iget-object v1, p0, Lu1/m;->o:Ljava/lang/String;

    invoke-static {v0, v1}, Lu1/s$a;->g(Lu1/s$a;Ljava/lang/String;)V

    return-void
.end method
