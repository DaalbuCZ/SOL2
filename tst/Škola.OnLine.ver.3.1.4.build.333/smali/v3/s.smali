.class public final synthetic Lv3/s;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lv3/x$a;

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:J


# direct methods
.method public synthetic constructor <init>(Lv3/x$a;Ljava/lang/Object;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv3/s;->n:Lv3/x$a;

    iput-object p2, p0, Lv3/s;->o:Ljava/lang/Object;

    iput-wide p3, p0, Lv3/s;->p:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lv3/s;->n:Lv3/x$a;

    iget-object v1, p0, Lv3/s;->o:Ljava/lang/Object;

    iget-wide v2, p0, Lv3/s;->p:J

    invoke-static {v0, v1, v2, v3}, Lv3/x$a;->e(Lv3/x$a;Ljava/lang/Object;J)V

    return-void
.end method
