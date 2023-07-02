.class public final Lcom/google/android/exoplayer2/source/hls/a;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lf3/f;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final b:Lf3/h;

.field public final c:Lf3/g;


# direct methods
.method constructor <init>(Lf3/h;Lf3/g;)V
    .locals 13

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/a;->b:Lf3/h;

    iput-object p2, p0, Lcom/google/android/exoplayer2/source/hls/a;->c:Lf3/g;

    new-instance p2, Lf3/f;

    iget-object v1, p1, Lf3/i;->a:Ljava/lang/String;

    iget-object v2, p1, Lf3/i;->b:Ljava/util/List;

    iget-object v3, p1, Lf3/h;->e:Ljava/util/List;

    iget-object v4, p1, Lf3/h;->f:Ljava/util/List;

    iget-object v5, p1, Lf3/h;->g:Ljava/util/List;

    iget-object v6, p1, Lf3/h;->h:Ljava/util/List;

    iget-object v7, p1, Lf3/h;->i:Ljava/util/List;

    iget-object v8, p1, Lf3/h;->j:Lx1/n1;

    iget-object v9, p1, Lf3/h;->k:Ljava/util/List;

    iget-boolean v10, p1, Lf3/i;->c:Z

    iget-object v11, p1, Lf3/h;->l:Ljava/util/Map;

    iget-object v12, p1, Lf3/h;->m:Ljava/util/List;

    move-object v0, p2

    invoke-direct/range {v0 .. v12}, Lf3/f;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lx1/n1;Ljava/util/List;ZLjava/util/Map;Ljava/util/List;)V

    iput-object p2, p0, Lcom/google/android/exoplayer2/source/hls/a;->a:Lf3/f;

    return-void
.end method
