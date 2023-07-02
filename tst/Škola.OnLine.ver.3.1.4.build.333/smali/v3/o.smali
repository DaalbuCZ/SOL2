.class public final synthetic Lv3/o;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lv3/x$a;

.field public final synthetic o:J

.field public final synthetic p:I


# direct methods
.method public synthetic constructor <init>(Lv3/x$a;JI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv3/o;->n:Lv3/x$a;

    iput-wide p2, p0, Lv3/o;->o:J

    iput p4, p0, Lv3/o;->p:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lv3/o;->n:Lv3/x$a;

    iget-wide v1, p0, Lv3/o;->o:J

    iget v3, p0, Lv3/o;->p:I

    invoke-static {v0, v1, v2, v3}, Lv3/x$a;->j(Lv3/x$a;JI)V

    return-void
.end method
