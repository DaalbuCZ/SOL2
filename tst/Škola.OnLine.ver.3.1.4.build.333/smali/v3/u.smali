.class public final synthetic Lv3/u;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lv3/x$a;

.field public final synthetic o:Ljava/lang/String;

.field public final synthetic p:J

.field public final synthetic q:J


# direct methods
.method public synthetic constructor <init>(Lv3/x$a;Ljava/lang/String;JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv3/u;->n:Lv3/x$a;

    iput-object p2, p0, Lv3/u;->o:Ljava/lang/String;

    iput-wide p3, p0, Lv3/u;->p:J

    iput-wide p5, p0, Lv3/u;->q:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lv3/u;->n:Lv3/x$a;

    iget-object v1, p0, Lv3/u;->o:Ljava/lang/String;

    iget-wide v2, p0, Lv3/u;->p:J

    iget-wide v4, p0, Lv3/u;->q:J

    invoke-static/range {v0 .. v5}, Lv3/x$a;->g(Lv3/x$a;Ljava/lang/String;JJ)V

    return-void
.end method
