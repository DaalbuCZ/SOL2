.class public final synthetic Ly7/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Ly7/c;

.field public final synthetic o:Ljava/lang/String;

.field public final synthetic p:I

.field public final synthetic q:Ly7/c$f;

.field public final synthetic r:Ljava/nio/ByteBuffer;

.field public final synthetic s:J


# direct methods
.method public synthetic constructor <init>(Ly7/c;Ljava/lang/String;ILy7/c$f;Ljava/nio/ByteBuffer;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly7/b;->n:Ly7/c;

    iput-object p2, p0, Ly7/b;->o:Ljava/lang/String;

    iput p3, p0, Ly7/b;->p:I

    iput-object p4, p0, Ly7/b;->q:Ly7/c$f;

    iput-object p5, p0, Ly7/b;->r:Ljava/nio/ByteBuffer;

    iput-wide p6, p0, Ly7/b;->s:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-object v0, p0, Ly7/b;->n:Ly7/c;

    iget-object v1, p0, Ly7/b;->o:Ljava/lang/String;

    iget v2, p0, Ly7/b;->p:I

    iget-object v3, p0, Ly7/b;->q:Ly7/c$f;

    iget-object v4, p0, Ly7/b;->r:Ljava/nio/ByteBuffer;

    iget-wide v5, p0, Ly7/b;->s:J

    invoke-static/range {v0 .. v6}, Ly7/c;->i(Ly7/c;Ljava/lang/String;ILy7/c$f;Ljava/nio/ByteBuffer;J)V

    return-void
.end method
