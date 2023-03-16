.class public abstract Lv4/t;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final n:Lt4/j;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lv4/t;->n:Lt4/j;

    return-void
.end method

.method public constructor <init>(Lt4/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv4/t;->n:Lt4/j;

    return-void
.end method


# virtual methods
.method protected abstract a()V
.end method

.method final b()Lt4/j;
    .locals 1

    iget-object v0, p0, Lv4/t;->n:Lt4/j;

    return-object v0
.end method

.method public final c(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lv4/t;->n:Lt4/j;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lt4/j;->d(Ljava/lang/Exception;)Z

    :cond_0
    return-void
.end method

.method public final run()V
    .locals 1

    :try_start_0
    invoke-virtual {p0}, Lv4/t;->a()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-virtual {p0, v0}, Lv4/t;->c(Ljava/lang/Exception;)V

    return-void
.end method
