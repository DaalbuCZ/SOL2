.class public La7/j;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final a:Lu6/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lu6/a;->e()Lu6/a;

    move-result-object v0

    sput-object v0, La7/j;->a:Lu6/a;

    return-void
.end method

.method public static a(Lcom/google/firebase/perf/metrics/Trace;Lv6/f$a;)Lcom/google/firebase/perf/metrics/Trace;
    .locals 3

    invoke-virtual {p1}, Lv6/f$a;->d()I

    move-result v0

    if-lez v0, :cond_0

    sget-object v0, La7/b;->r:La7/b;

    invoke-virtual {v0}, La7/b;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lv6/f$a;->d()I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {p0, v0, v1, v2}, Lcom/google/firebase/perf/metrics/Trace;->putMetric(Ljava/lang/String;J)V

    :cond_0
    invoke-virtual {p1}, Lv6/f$a;->c()I

    move-result v0

    if-lez v0, :cond_1

    sget-object v0, La7/b;->s:La7/b;

    invoke-virtual {v0}, La7/b;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lv6/f$a;->c()I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {p0, v0, v1, v2}, Lcom/google/firebase/perf/metrics/Trace;->putMetric(Ljava/lang/String;J)V

    :cond_1
    invoke-virtual {p1}, Lv6/f$a;->b()I

    move-result v0

    if-lez v0, :cond_2

    sget-object v0, La7/b;->t:La7/b;

    invoke-virtual {v0}, La7/b;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lv6/f$a;->b()I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {p0, v0, v1, v2}, Lcom/google/firebase/perf/metrics/Trace;->putMetric(Ljava/lang/String;J)V

    :cond_2
    sget-object v0, La7/j;->a:Lu6/a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Screen trace: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/google/firebase/perf/metrics/Trace;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " _fr_tot:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lv6/f$a;->d()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " _fr_slo:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lv6/f$a;->c()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " _fr_fzn:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lv6/f$a;->b()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lu6/a;->a(Ljava/lang/String;)V

    return-object p0
.end method
