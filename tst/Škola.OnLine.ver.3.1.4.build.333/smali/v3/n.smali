.class public final synthetic Lv3/n;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lv3/x$a;

.field public final synthetic o:I

.field public final synthetic p:J


# direct methods
.method public synthetic constructor <init>(Lv3/x$a;IJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv3/n;->n:Lv3/x$a;

    iput p2, p0, Lv3/n;->o:I

    iput-wide p3, p0, Lv3/n;->p:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lv3/n;->n:Lv3/x$a;

    iget v1, p0, Lv3/n;->o:I

    iget-wide v2, p0, Lv3/n;->p:J

    invoke-static {v0, v1, v2, v3}, Lv3/x$a;->f(Lv3/x$a;IJ)V

    return-void
.end method
