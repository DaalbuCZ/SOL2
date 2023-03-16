.class public abstract Lk9/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo9/a;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk9/c$a;
    }
.end annotation


# static fields
.field public static final t:Ljava/lang/Object;


# instance fields
.field private transient n:Lo9/a;

.field protected final o:Ljava/lang/Object;

.field private final p:Ljava/lang/Class;

.field private final q:Ljava/lang/String;

.field private final r:Ljava/lang/String;

.field private final s:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lk9/c$a;->a()Lk9/c$a;

    move-result-object v0

    sput-object v0, Lk9/c;->t:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, Lk9/c;->t:Ljava/lang/Object;

    invoke-direct {p0, v0}, Lk9/c;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method protected constructor <init>(Ljava/lang/Object;)V
    .locals 6

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lk9/c;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method protected constructor <init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk9/c;->o:Ljava/lang/Object;

    iput-object p2, p0, Lk9/c;->p:Ljava/lang/Class;

    iput-object p3, p0, Lk9/c;->q:Ljava/lang/String;

    iput-object p4, p0, Lk9/c;->r:Ljava/lang/String;

    iput-boolean p5, p0, Lk9/c;->s:Z

    return-void
.end method


# virtual methods
.method public a()Lo9/a;
    .locals 1

    iget-object v0, p0, Lk9/c;->n:Lo9/a;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lk9/c;->b()Lo9/a;

    move-result-object v0

    iput-object v0, p0, Lk9/c;->n:Lo9/a;

    :cond_0
    return-object v0
.end method

.method protected abstract b()Lo9/a;
.end method

.method public e()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lk9/c;->o:Ljava/lang/Object;

    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lk9/c;->q:Ljava/lang/String;

    return-object v0
.end method

.method public h()Lo9/c;
    .locals 2

    iget-object v0, p0, Lk9/c;->p:Ljava/lang/Class;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-boolean v1, p0, Lk9/c;->s:Z

    if-eqz v1, :cond_1

    invoke-static {v0}, Lk9/s;->c(Ljava/lang/Class;)Lo9/c;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-static {v0}, Lk9/s;->b(Ljava/lang/Class;)Lo9/b;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lk9/c;->r:Ljava/lang/String;

    return-object v0
.end method
