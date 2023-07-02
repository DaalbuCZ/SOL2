.class public final synthetic Lv7/b0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Z

.field public final synthetic o:Ljava/lang/String;

.field public final synthetic p:Lt8/k$d;

.field public final synthetic q:Ljava/lang/Boolean;

.field public final synthetic r:Lv7/i;

.field public final synthetic s:Lt8/j;

.field public final synthetic t:Z

.field public final synthetic u:I


# direct methods
.method public synthetic constructor <init>(ZLjava/lang/String;Lt8/k$d;Ljava/lang/Boolean;Lv7/i;Lt8/j;ZI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lv7/b0;->n:Z

    iput-object p2, p0, Lv7/b0;->o:Ljava/lang/String;

    iput-object p3, p0, Lv7/b0;->p:Lt8/k$d;

    iput-object p4, p0, Lv7/b0;->q:Ljava/lang/Boolean;

    iput-object p5, p0, Lv7/b0;->r:Lv7/i;

    iput-object p6, p0, Lv7/b0;->s:Lt8/j;

    iput-boolean p7, p0, Lv7/b0;->t:Z

    iput p8, p0, Lv7/b0;->u:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    iget-boolean v0, p0, Lv7/b0;->n:Z

    iget-object v1, p0, Lv7/b0;->o:Ljava/lang/String;

    iget-object v2, p0, Lv7/b0;->p:Lt8/k$d;

    iget-object v3, p0, Lv7/b0;->q:Ljava/lang/Boolean;

    iget-object v4, p0, Lv7/b0;->r:Lv7/i;

    iget-object v5, p0, Lv7/b0;->s:Lt8/j;

    iget-boolean v6, p0, Lv7/b0;->t:Z

    iget v7, p0, Lv7/b0;->u:I

    invoke-static/range {v0 .. v7}, Lv7/c0;->a(ZLjava/lang/String;Lt8/k$d;Ljava/lang/Boolean;Lv7/i;Lt8/j;ZI)V

    return-void
.end method
